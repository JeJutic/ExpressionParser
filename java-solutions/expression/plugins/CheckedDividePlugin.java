package expression.plugins;

import expression.BinaryOperator;
import expression.exceptions.CheckedDivide;
import expression.ExpressionComparator;

public class CheckedDividePlugin extends DividePlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedDivide(first, second);
    }
}
