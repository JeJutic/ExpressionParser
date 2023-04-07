package expression.plugins;

import expression.BinaryOperator;
import expression.ExpressionComparator;
import expression.exceptions.CheckedSubtract;

public class CheckedSubtractPlugin extends SubtractPlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedSubtract(first, second);
    }
}
