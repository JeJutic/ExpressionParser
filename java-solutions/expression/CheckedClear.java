package expression;

public class CheckedClear extends Clear {
    public CheckedClear(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        return super.apply(a, b);
    }
}
