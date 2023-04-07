package expression;

public class Clear extends BinaryOperator {
    private static final String operStr = "clear";

    public Clear(ExpressionComparator first, ExpressionComparator second) {
        super(first, second, operStr, EXPRESSION_PRIORITY.CLEAR, false, true);
    }

    @Override
    public int apply(int a, int b) {
        if (b < 0) {
            b += 32;
        }
        if ((a & (1 << b)) != 0) {
            return a - (1 << b);
        } else {
            return a;
        }
    }

    @Override
    public double apply(double a, double b) {
        throw new UnsupportedOperationException("Clear operation isn't defined for double");
    }
}
