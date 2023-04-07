package expression;

public class Add extends BinaryOperator {
    private static final String operStr = "+";
    private static final EXPRESSION_PRIORITY priority = EXPRESSION_PRIORITY.ADD;
    private static final boolean associative = true;
    private static final boolean reversal = false;

    public Add(ExpressionComparator first, ExpressionComparator second) {
        super(first, second, operStr, priority, associative, reversal);
    }

    @Override
    public int apply(int a, int b) {
        return a + b;
    }

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}
