package expression.exceptions;

import expression.Add;
import expression.ExpressionComparator;

public class CheckedAdd extends Add {
    public CheckedAdd(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        int c = a + b;
        if ((a ^ c) < 0 && (b ^ c) < 0) {
            throw new OverflowException("Add operation");
        }
        return c;
    }
}
