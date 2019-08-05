# 说明
> 将`elasticsearch-sql`使用**antlr4**进行重写，并添加多语言实现

# 功能点
- [x] SQL Select  
- [x] SQL Where  
- [x] SQL Order by (Asc & Desc)
- [x] SQL Group by (Terms & Range)
- [x] ES Aggregate by
- [x] SQL And & Or
- [x] SQL In
- [x] SQL Between And
- [x] SQL Is
- [x] SQL Not
- [-] SQL Null
- [-] SQL Nvl
- [x] SQL Max
- [x] SQL Min
- [x] SQL Sum
- [x] SQL Avg
- [x] SQL > & < & >= & <=
- [x] ES FullText
- [x] ES Match
- [x] ES MultiMatch
- [x] ES QueryString
- [-] ES SimpleQueryString
- [x] ES HasParent
- [x] ES HasChild
- [x] ES Join
- [x] ES Script
- [-] ES Fuzzy
- [x] ES Prefix
- [x] ES Regex
- [x] ES Term
- [x] ES Wildcard
- [x] ES Routing
- [x] ES Nested
- [x] ES Include[fields]
- [x] ES From
- [x] ES Size
- [x] ES Range(Number,Date)
- [x] ES MatchAll
- [x] ES MatchPhrase
- [x] ES MatchPhrasePrefix
- [-] ES DeleteByQuery
- [x] ES Cardinality (目前不支持Script的方式)
- [x] ES TopHits
- [x] ES Nested
- [x] ES GeoDistance
- [x] 支持嵌套深层聚类
- [-] ES Scroll Id
- [x] ES 支持多层嵌套查询
- [-] ES Highlighter
- [-] ES Boosting
- [-] ES Function Score
- [x] SQL Like
- [-] SQL Desc
- [x] ES Excludes

使用文档
--------------------
[elasticsql-wiki](https://github.com/iamazy/elasticsql/wiki)

# 示例
### 1. select,include,exclude,from,where,in,and,or,has_parent,geo_distance,limit
```sql
select name,^h!age,h!gender from student where ((a in (1,2,3,4)) and has_parent(apple,bb~='fruit')) and c=1 and (location = 'geoaaa' and geopoint = '40.0,30.0' and distance = '1km' or t='bb') limit 2,5
```
> 生成dsl
```json
{
  "from" : 2,
  "size" : 5,
  "query" : {
    "bool" : {
      "must" : [ {
        "terms" : {
          "a" : [ "1", "2", "3", "4" ],
          "boost" : 1.0
        }
      }, {
        "has_parent" : {
          "query" : {
            "bool" : {
              "must" : [ {
                "match" : {
                  "bb" : {
                    "query" : "'fruit'",
                    "operator" : "OR",
                    "prefix_length" : 0,
                    "max_expansions" : 50,
                    "fuzzy_transpositions" : true,
                    "lenient" : false,
                    "zero_terms_query" : "NONE",
                    "auto_generate_synonyms_phrase_query" : true,
                    "boost" : 1.0
                  }
                }
              } ],
              "adjust_pure_negative" : true,
              "minimum_should_match" : "1",
              "boost" : 1.0
            }
          },
          "parent_type" : "apple",
          "score" : true,
          "ignore_unmapped" : false,
          "boost" : 1.0
        }
      }, {
        "term" : {
          "c" : {
            "value" : "1",
            "boost" : 1.0
          }
        }
      } ],
      "should" : [ {
        "geo_distance" : {
          "geoaaa" : [ 30.0, 40.0 ],
          "distance" : 1000.0,
          "distance_type" : "arc",
          "validation_method" : "STRICT",
          "ignore_unmapped" : false,
          "boost" : 1.0
        }
      }, {
        "term" : {
          "t" : {
            "value" : "'bb'",
            "boost" : 1.0
          }
        }
      } ],
      "adjust_pure_negative" : true,
      "minimum_should_match" : "1",
      "boost" : 1.0
    }
  },
  "_source" : {
    "includes" : [ "name", "gender" ],
    "excludes" : [ "age" ]
  }
}
```

### 2. nested,query_string,match(~==)
```sql
select name from student where (([class1, age>1 and [class1.class2, name='hhha']] and c=1) or b~=='hhhhh') and query by 'apppple' limit 2,5
```
> 生成dsl
```json
{
  "from" : 2,
  "size" : 5,
  "query" : {
    "bool" : {
      "must" : [ {
        "query_string" : {
          "query" : "apppple",
          "fields" : [ ],
          "type" : "best_fields",
          "default_operator" : "or",
          "max_determinized_states" : 10000,
          "enable_position_increments" : true,
          "fuzziness" : "AUTO",
          "fuzzy_prefix_length" : 0,
          "fuzzy_max_expansions" : 50,
          "phrase_slop" : 0,
          "escape" : false,
          "auto_generate_synonyms_phrase_query" : true,
          "fuzzy_transpositions" : true,
          "boost" : 1.0
        }
      } ],
      "should" : [ {
        "bool" : {
          "must" : [ {
            "nested" : {
              "query" : {
                "bool" : {
                  "must" : [ {
                    "range" : {
                      "age" : {
                        "from" : "1",
                        "to" : null,
                        "include_lower" : false,
                        "include_upper" : true,
                        "boost" : 1.0
                      }
                    }
                  }, {
                    "nested" : {
                      "query" : {
                        "bool" : {
                          "must" : [ {
                            "term" : {
                              "name" : {
                                "value" : "'hhha'",
                                "boost" : 1.0
                              }
                            }
                          } ],
                          "adjust_pure_negative" : true,
                          "minimum_should_match" : "1",
                          "boost" : 1.0
                        }
                      },
                      "path" : "class1.class2",
                      "ignore_unmapped" : false,
                      "score_mode" : "avg",
                      "boost" : 1.0
                    }
                  } ],
                  "adjust_pure_negative" : true,
                  "minimum_should_match" : "1",
                  "boost" : 1.0
                }
              },
              "path" : "class1",
              "ignore_unmapped" : false,
              "score_mode" : "avg",
              "boost" : 1.0
            }
          }, {
            "term" : {
              "c" : {
                "value" : "1",
                "boost" : 1.0
              }
            }
          } ],
          "adjust_pure_negative" : true,
          "boost" : 1.0
        }
      }, {
        "match_phrase" : {
          "b" : {
            "query" : "'hhhhh'",
            "slop" : 0,
            "zero_terms_query" : "NONE",
            "boost" : 1.0
          }
        }
      } ],
      "adjust_pure_negative" : true,
      "minimum_should_match" : "1",
      "boost" : 1.0
    }
  },
  "_source" : {
    "includes" : [ "name" ],
    "excludes" : [ ]
  }
}
```

### 3. aggregate by
```sql
select name from student aggregate by terms(name,1)>(terms(aa,2),terms(bb,3)>(terms(cc,4))),terms(age,10)>(terms(weight,10))
```
> 生成dsl
```json
{
  "from" : 0,
  "size" : 15,
  "query" : {
    "match_all" : {
      "boost" : 1.0
    }
  },
  "_source" : {
    "includes" : [ "name" ],
    "excludes" : [ ]
  },
  "aggregations" : {
    "name" : {
      "terms" : {
        "size" : 1,
        "shard_size" : 2,
        "min_doc_count" : 1,
        "shard_min_doc_count" : 1,
        "show_term_doc_count_error" : false,
        "order" : [ {
          "_count" : "desc"
        }, {
          "_key" : "asc"
        } ]
      },
      "aggregations" : {
        "aa" : {
          "terms" : {
            "size" : 2,
            "shard_size" : 4,
            "min_doc_count" : 1,
            "shard_min_doc_count" : 1,
            "show_term_doc_count_error" : false,
            "order" : [ {
              "_count" : "desc"
            }, {
              "_key" : "asc"
            } ]
          }
        },
        "bb" : {
          "terms" : {
            "size" : 3,
            "shard_size" : 6,
            "min_doc_count" : 1,
            "shard_min_doc_count" : 1,
            "show_term_doc_count_error" : false,
            "order" : [ {
              "_count" : "desc"
            }, {
              "_key" : "asc"
            } ]
          },
          "aggregations" : {
            "cc" : {
              "terms" : {
                "size" : 4,
                "shard_size" : 8,
                "min_doc_count" : 1,
                "shard_min_doc_count" : 1,
                "show_term_doc_count_error" : false,
                "order" : [ {
                  "_count" : "desc"
                }, {
                  "_key" : "asc"
                } ]
              }
            }
          }
        }
      }
    },
    "age" : {
      "terms" : {
        "size" : 10,
        "shard_size" : 20,
        "min_doc_count" : 1,
        "shard_min_doc_count" : 1,
        "show_term_doc_count_error" : false,
        "order" : [ {
          "_count" : "desc"
        }, {
          "_key" : "asc"
        } ]
      },
      "aggregations" : {
        "weight" : {
          "terms" : {
            "size" : 10,
            "shard_size" : 20,
            "min_doc_count" : 1,
            "shard_min_doc_count" : 1,
            "show_term_doc_count_error" : false,
            "order" : [ {
              "_count" : "desc"
            }, {
              "_key" : "asc"
            } ]
          }
        }
      }
    }
  }
}
```

### 4. nested aggregation,subAggregation(~)
```sql
select name from student aggregate by terms(name,1)>(terms(aa,2),[apple,cardinality(ip),terms(aaa,1)>(terms(bb,1),terms(cc,10)>(terms(hh,3),avg(age)),terms(vv,1))]) limit 2,5
```
> 生成dsl
```json
{
  "from" : 2,
  "size" : 5,
  "query" : {
    "match_all" : {
      "boost" : 1.0
    }
  },
  "_source" : {
    "includes" : [ "name" ],
    "excludes" : [ ]
  },
  "aggregations" : {
    "name" : {
      "terms" : {
        "size" : 1,
        "shard_size" : 2,
        "min_doc_count" : 1,
        "shard_min_doc_count" : 1,
        "show_term_doc_count_error" : false,
        "order" : [ {
          "_count" : "desc"
        }, {
          "_key" : "asc"
        } ]
      },
      "aggregations" : {
        "aa" : {
          "terms" : {
            "size" : 2,
            "shard_size" : 4,
            "min_doc_count" : 1,
            "shard_min_doc_count" : 1,
            "show_term_doc_count_error" : false,
            "order" : [ {
              "_count" : "desc"
            }, {
              "_key" : "asc"
            } ]
          }
        },
        "nested_apple" : {
          "nested" : {
            "path" : "apple"
          },
          "aggregations" : {
            "ip_cardinality" : {
              "cardinality" : {
                "field" : "ip"
              }
            },
            "aaa" : {
              "terms" : {
                "size" : 1,
                "shard_size" : 2,
                "min_doc_count" : 1,
                "shard_min_doc_count" : 1,
                "show_term_doc_count_error" : false,
                "order" : [ {
                  "_count" : "desc"
                }, {
                  "_key" : "asc"
                } ]
              },
              "aggregations" : {
                "bb" : {
                  "terms" : {
                    "size" : 1,
                    "shard_size" : 2,
                    "min_doc_count" : 1,
                    "shard_min_doc_count" : 1,
                    "show_term_doc_count_error" : false,
                    "order" : [ {
                      "_count" : "desc"
                    }, {
                      "_key" : "asc"
                    } ]
                  }
                },
                "cc" : {
                  "terms" : {
                    "size" : 10,
                    "shard_size" : 20,
                    "min_doc_count" : 1,
                    "shard_min_doc_count" : 1,
                    "show_term_doc_count_error" : false,
                    "order" : [ {
                      "_count" : "desc"
                    }, {
                      "_key" : "asc"
                    } ]
                  },
                  "aggregations" : {
                    "hh" : {
                      "terms" : {
                        "size" : 3,
                        "shard_size" : 6,
                        "min_doc_count" : 1,
                        "shard_min_doc_count" : 1,
                        "show_term_doc_count_error" : false,
                        "order" : [ {
                          "_count" : "desc"
                        }, {
                          "_key" : "asc"
                        } ]
                      }
                    },
                    "age_avg" : {
                      "avg" : {
                        "field" : "age"
                      }
                    }
                  }
                },
                "vv" : {
                  "terms" : {
                    "size" : 1,
                    "shard_size" : 2,
                    "min_doc_count" : 1,
                    "shard_min_doc_count" : 1,
                    "show_term_doc_count_error" : false,
                    "order" : [ {
                      "_count" : "desc"
                    }, {
                      "_key" : "asc"
                    } ]
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
```