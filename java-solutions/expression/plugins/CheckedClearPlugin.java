package expression.plugins;

import expression.BinaryOperator;
import expression.CheckedClear;
import expression.ExpressionComparator;

public class CheckedClearPlugin extends ClearPlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedClear(first, second);
    }
}
