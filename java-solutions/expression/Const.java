package expression;

import java.util.Objects;

public class Const extends ExpressionComparator implements AllExpression {
    private static final EXPRESSION_PRIORITY priority = EXPRESSION_PRIORITY.VARIABLE_AND_CONST;
    private final Number val;

    private Const(Number val) {
        super(priority);
        this.val = val;
    }

    public Const(int val) {
        this((Number) val);
    }

    @Override
    public int evaluate(int var) {
        return val.intValue();
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return val.intValue();
    }

    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public String toMiniString() {
        return val.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Const aConst = (Const) o;
        return val.equals(aConst.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
