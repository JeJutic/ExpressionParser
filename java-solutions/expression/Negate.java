package expression;

public class Negate extends UnaryOperator {

    public Negate(ExpressionComparator inner) {
        super(inner, "-");
    }

    @Override
    public int apply(int a) {
        return -a;
    }
}
