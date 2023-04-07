package expression.plugins;

import expression.BinaryOperator;
import expression.Clear;
import expression.ExpressionComparator;

public class ClearPlugin extends BinaryOperatorPlugin {
    public ClearPlugin() {
        super("clear", true);
    }

    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new Clear(first, second);
    }
}
