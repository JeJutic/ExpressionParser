package expression.plugins;

import expression.BinaryOperator;
import expression.ExpressionComparator;
import expression.exceptions.CheckedMultiply;

public class CheckedMultiplyPlugin extends MultiplyPlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedMultiply(first, second);
    }
}
