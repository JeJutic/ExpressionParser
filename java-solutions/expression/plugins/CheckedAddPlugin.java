package expression.plugins;

import expression.BinaryOperator;
import expression.ExpressionComparator;
import expression.exceptions.CheckedAdd;

public class CheckedAddPlugin extends AddPlugin {
    @Override
    public BinaryOperator create(ExpressionComparator first, ExpressionComparator second) {
        return new CheckedAdd(first, second);
    }
}
