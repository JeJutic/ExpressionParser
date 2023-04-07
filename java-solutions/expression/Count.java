package expression;

public class Count extends UnaryOperator {
    private static final String operStr = "count";

    public Count(ExpressionComparator inner) {
        super(inner, operStr);
    }

    @Override
    public int apply(int a) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((a & (1 << i)) != 0) {
                res++;
            }
        }
        return res;
    }
}
