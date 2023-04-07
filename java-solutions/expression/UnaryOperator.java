package expression;

abstract public class UnaryOperator extends ExpressionComparator implements Expression, TripleExpression {
    private final ExpressionComparator inner;
    private final String operStr;

    protected UnaryOperator(ExpressionComparator inner, String operStr) {
        super(EXPRESSION_PRIORITY.UNARY_OPERATOR);
        this.inner = inner;
        this.operStr = operStr;
    }

    public abstract int apply(int a);

    @Override
    public int evaluate(int x) {
        Expression expr = (Expression) inner;
        return apply(expr.evaluate(x));
    }

    @Override
    public int evaluate(int x, int y, int z) {
        TripleExpression expr = (TripleExpression) inner;
        return apply(expr.evaluate(x, y, z));
    }

    @Override
    public String toMiniString() {
        return operStr +
                (super.compareTo(inner) > 0 ? '(' : ' ') +
                inner.toMiniString() +
                (super.compareTo(inner) > 0 ? ")" : "");
    }

    @Override
    public String toString() {
        return operStr + '(' + inner.toString() + ')';
    }
}
