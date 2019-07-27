package io.github.iamazy.elasticsearch.dsl.sql;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition
 **/
public enum  Operation {

    MUL     ( "*"   ),
    DIV     ( "/"   ),
    REM     ( "%"   ),
    ADD     ( "+"   ),
    SUB     ( "-"   ),
    FIND    ( "=~"  ),
    MATCH   ( "==~" ),
    LSH     ( "<<"  ),
    RSH     ( ">>"  ),
    USH     ( ">>>" ),
    BWNOT   ( "~"   ),
    BWAND   ( "&"   ),
    XOR     ( "^"   ),
    BWOR    ( "|"   ),
    NOT     ( "!"   ),
    AND     ( "&&"  ),
    OR      ( "||"  ),
    LT      ( "<"   ),
    LTE     ( "<="  ),
    GT      ( ">"   ),
    GTE     ( ">="  ),
    EQ      ( "=="  ),
    EQR     ( "===" ),
    NE      ( "!="  ),
    NER     ( "!==" ),
    INCR    ( "++"  ),
    DECR    ( "--"  )

    ;

    public final String symbol;

    Operation(final String symbol){
        this.symbol=symbol;
    }
}
