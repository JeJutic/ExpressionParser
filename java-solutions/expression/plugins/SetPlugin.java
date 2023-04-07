package expression.plugins;

import expression.BinaryOperator;
import expression.ExpressionComparator;
import expression.Set;

public class SetPlugin extends BinaryOperatorPlugin {
    public SetPlugin() {
        super("set", true);
    }

    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new Set(first, second);
    }
}
