package expression.exceptions;

import expression.ExpressionComparator;
import expression.Multiply;

public class CheckedMultiply extends Multiply {
    public CheckedMultiply(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        if (b != 0 && a * b / b != a) {
            throw new OverflowException("Multiply operation");
        }
        if (b == -1 && a == Integer.MIN_VALUE) {
            throw new OverflowException("Sign-specific overflow in Multiply operation");
        }
        return a * b;
    }
}
