package expression;

public class Reverse extends UnaryOperator {
    private final static int[] pow10;
    static {
        pow10 = new int[10];
        pow10[0] = 1;
        for (int i = 1; i < pow10.length; i++) {
            pow10[i] = pow10[i-1] * 10;
        }
    }

    public Reverse(ExpressionComparator inner) {
        super(inner, "reverse");
    }

    @Override
    public int apply(int a) {
        if (a == Integer.MIN_VALUE) {
            return 126087180;
        }
        boolean neg = a < 0;
        if (neg) {
            a *= -1;
        }
        int maxpw = 0;
        for (; maxpw < 9; maxpw++) {
            if (a < pow10[maxpw + 1]) {
                break;
            }
        }
        int res = 0;
        for (int i = maxpw; i >= 0; i--) {
            res += a % 10 * pow10[i];
            a /= 10;
        }
        if (neg) {
            res *= -1;
        }
        return res;
    }
}
