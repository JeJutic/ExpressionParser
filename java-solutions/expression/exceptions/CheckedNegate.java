package expression.exceptions;

import expression.ExpressionComparator;
import expression.Negate;

public class CheckedNegate extends Negate {
    public CheckedNegate(ExpressionComparator inner) {
        super(inner);
    }

    @Override
    public int apply(int a) {
        if (a == Integer.MIN_VALUE) {
            throw new OverflowException("Impossible to negate the minimal integer");
        }
        return -a;
    }
}
