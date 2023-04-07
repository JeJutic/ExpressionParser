package expression;

public class Subtract extends BinaryOperator {
    private static final String operStr = "-";
    private static final EXPRESSION_PRIORITY priority = EXPRESSION_PRIORITY.SUBTRACT;
    private static final boolean associative = false;
    private static final boolean reversal = true;

    public Subtract(ExpressionComparator first, ExpressionComparator second) {
        super(first, second, operStr, priority, associative, reversal);
    }

    @Override
    public int apply(int a, int b) {
        return a - b;
    }

    @Override
    public double apply(double a, double b) {
        return a - b;
    }

//    @Override
//    protected boolean needsRightBracket(ToMiniString anyExpr) {
//        return anyExpr.getClass() == Add.class ||
//                anyExpr.getClass() == Subtract.class;
//    }
}
