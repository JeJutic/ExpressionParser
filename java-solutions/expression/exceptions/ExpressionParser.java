package expression.exceptions;

import expression.TripleExpression;
import expression.parser.ParsingException;
import expression.parser.StringCharSource;

public final class ExpressionParser implements TripleParser {
    @Override
    public TripleExpression parse(String expression) throws ParsingException {
        return new CheckedExpressionToComparatorParser(
                new StringCharSource(expression)
        ).parse();
    }
}