package expression.plugins;

import expression.BinaryOperator;
import expression.CheckedSet;
import expression.ExpressionComparator;

public class CheckedSetPlugin extends SetPlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedSet(first, second);
    }
}
