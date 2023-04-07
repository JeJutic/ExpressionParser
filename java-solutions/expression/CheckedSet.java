package expression;

import expression.exceptions.OverflowException;

public class CheckedSet extends Set {
    public CheckedSet(ExpressionComparator first, ExpressionComparator second) {
        super(first, second);
    }

    @Override
    public int apply(int a, int b) {
        return super.apply(a, b);
    }
}
