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
    private GeoPolygonQueryParser geoPolygonQueryParser;
    private GeoBoundingBoxQueryParser geoBoundingBoxQueryParser;

    public GeoQueryParser(){
        this.geoDistanceQueryParser=new GeoDistanceQueryParser();
        this.geoBoundingBoxQueryParser=new GeoBoundingBoxQueryParser();
        this.geoPolygonQueryParser=new GeoPolygonQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoContext expression) {
        if(expression.geoClause().geoDistanceClause()!=null){
            return geoDistanceQueryParser.parse(expression.geoClause().geoDistanceClause());
        }else if(expression.geoClause().geoBoundingBoxClause()!=null){
            return geoBoundingBoxQueryParser.parse(expression.geoClause().geoBoundingBoxClause());
        }else if(expression.geoClause().geoPolygonClause()!=null){
            return geoPolygonQueryParser.parse(expression.geoClause().geoPolygonClause());
        }
        else{
            throw new ElasticSql2DslException("geo query only support GeoDistanceQuery yet");
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoContext.class==clazz
                || ElasticsearchParser.GeoDistanceClauseContext.class==clazz
                || ElasticsearchParser.GeoBoundingBoxClauseContext.class==clazz
                || ElasticsearchParser.GeoPolygonClauseContext.class==clazz;
    }
}
