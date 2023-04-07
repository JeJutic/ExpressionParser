package expression.exceptions;

import expression.Divide;
import expression.ExpressionComparator;

public class CheckedDivide extends Divide {
    public CheckedDivide(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a == Integer.MIN_VALUE && b == -1) {
            throw new OverflowException("Sign-specific overflow in Division operation");
        }
        return a / b;
    }
}
