package expression.plugins;

import expression.Count;
import expression.ExpressionComparator;
import expression.UnaryOperator;

public class CountPlugin extends UnaryOperatorPlugin {
    public CountPlugin() {
        super("count", true);
    }

    @Override
    public UnaryOperator create(ExpressionComparator inner) {
        return new Count(inner);
    }
}
