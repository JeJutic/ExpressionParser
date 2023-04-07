package expression.plugins;

import expression.ExpressionComparator;
import expression.UnaryOperator;
import expression.exceptions.CheckedNegate;

public class CheckedNegatePlugin extends NegatePlugin {
    @Override
    public UnaryOperator create(ExpressionComparator inner) {
        return new CheckedNegate(inner);
    }
}
