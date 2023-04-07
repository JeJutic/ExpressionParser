package expression;

public class Multiply extends BinaryOperator {
    private static final String operStr = "*";
    private static final EXPRESSION_PRIORITY priority = EXPRESSION_PRIORITY.MULTIPLY;
    private static final boolean associative = true;
    private static final boolean reversal = true;

    public Multiply(ExpressionComparator first, ExpressionComparator second) {
        super(first, second, operStr, priority, associative, reversal);
    }

    @Override
    public int apply(int a, int b) {
        return a * b;
    }

    @Override
    public double apply(double a, double b) {
        return a * b;
    }
}
