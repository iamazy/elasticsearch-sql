package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019/8/2
 * @descrition
 **/
public class GeoQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoContext> {

    private GeoDistanceQueryParser geoDistanceQueryParser;

    public GeoQueryParser(){
        this.geoDistanceQueryParser=new GeoDistanceQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoContext expression) {
        if(expression.geoClause().geoDistanceClause()!=null){
            return geoDistanceQueryParser.parse(expression.geoClause().geoDistanceClause());
        }else if(expression.geoClause().geoBoundingBoxClause()!=null){
            //TODO add geo bounding box query
            throw new ElasticSql2DslException("geo query only support GeoDistanceQuery yet");
        }else{
            throw new ElasticSql2DslException("geo query only support GeoDistanceQuery yet");
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoContext.class==clazz || ElasticsearchParser.GeoDistanceClauseContext.class==clazz;
    }
}
