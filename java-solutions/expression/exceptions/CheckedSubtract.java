package expression.exceptions;

import expression.ExpressionComparator;
import expression.Subtract;

public class CheckedSubtract extends Subtract {
    public CheckedSubtract(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        int c = a - b;
        if ((a ^ b) < 0 && (a ^ c) < 0) {
            throw new OverflowException("Overflow in Subtract operation");
        }
        return c;
    }
}
