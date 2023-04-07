package expression;

import java.util.Objects;

public class Variable extends ExpressionComparator implements AllExpression {
    private static final EXPRESSION_PRIORITY priority = EXPRESSION_PRIORITY.VARIABLE_AND_CONST;
    private final String name;
    private static final String[] varNames = {"x", "y", "z"};
    // if any operation has a substring with var name, then vars in text should be surrounded with ws

    public Variable(String name) {
        super(priority);
        this.name = name;
    }

    public static String[] getVarNames() {
        return varNames;
    }

    @Override
    public int evaluate(int var) {
        return var;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        if (Objects.equals(name, varNames[0])) {
            return x;
        } else if (Objects.equals(name, varNames[1])) {
            return y;
        } else if (Objects.equals(name, varNames[2])) {
            return z;
        }
        throw new RuntimeException(
                "Variable isn't one of " + varNames[0] + ' ' + varNames[1] + ' ' + varNames[2]
        );
    }

    @Override
    public String toMiniString() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable = (Variable) o;
        return name.equals(variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
