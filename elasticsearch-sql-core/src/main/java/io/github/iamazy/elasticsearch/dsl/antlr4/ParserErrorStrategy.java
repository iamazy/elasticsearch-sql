package io.github.iamazy.elasticsearch.dsl.antlr4;

import io.github.iamazy.elasticsearch.dsl.sql.model.Location;
import org.antlr.v4.runtime.*;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
final class ParserErrorStrategy extends DefaultErrorStrategy {

    private final String sql;

    ParserErrorStrategy(String sourceName) {
        this.sql = sourceName;
    }

    @Override
    public void recover(final Parser recognizer, final RecognitionException re) {
        final Token token = re.getOffendingToken();
        String message;

        if (token == null) {
            message = "no parse token found.";
        } else if (re instanceof InputMismatchException) {
            message = "unexpected token [" + getTokenErrorDisplay(token) + "]" +
                    " was expecting one of [" + re.getExpectedTokens().toString(recognizer.getVocabulary()) + "].";
        } else if (re instanceof NoViableAltException) {
            if (token.getType() == ElasticsearchParser.EOF) {
                message = "unexpected end of script.";
            } else {
                message = "invalid sequence of tokens near [" + getTokenErrorDisplay(token) + "].";
            }
        } else {
            message =  "unexpected token near [" + getTokenErrorDisplay(token) + "].";
        }

        Location location = new Location(sql, token == null ? -1 : token.getStartIndex());
        throw location.createError(new IllegalArgumentException(message, re));
    }

    @Override
    public Token recoverInline(final Parser recognizer) throws RecognitionException {
        final Token token = recognizer.getCurrentToken();
        final String message = "unexpected token [" + getTokenErrorDisplay(token) + "]" +
                " was expecting one of [" + recognizer.getExpectedTokens().toString(recognizer.getVocabulary()) + "].";

        Location location = new Location(sql, token.getStartIndex());
        throw location.createError(new IllegalArgumentException(message));
    }

    @Override
    public void sync(final Parser recognizer) {
    }
}
