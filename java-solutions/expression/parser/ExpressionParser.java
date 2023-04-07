package expression.parser;

import expression.*;

public final class ExpressionParser implements TripleParser {
    @Override
    public TripleExpression parse(String expression) {
        try {
            return new ExpressionToComparatorParser(
                    new StringCharSource(expression)
            ).parse();
        } catch (ParsingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}