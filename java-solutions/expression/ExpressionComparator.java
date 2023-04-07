package expression;

public abstract class ExpressionComparator implements AllExpression, Comparable<ExpressionComparator> {
    private final EXPRESSION_PRIORITY priority;

    protected ExpressionComparator(EXPRESSION_PRIORITY priority) {
        this.priority = priority;
    }

    public EXPRESSION_PRIORITY getPriority() {
        return priority;
    }

    public int compareTo(EXPRESSION_PRIORITY p) {
        return priority.compare(priority, p);
    }

    @Override
    public int compareTo(ExpressionComparator a) {
        return priority.compare(priority, a.getPriority());
    }
}
