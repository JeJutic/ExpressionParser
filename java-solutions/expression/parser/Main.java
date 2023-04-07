package expression.parser;

import expression.TripleExpression;

public class Main {
    public static void main(String[] args) {
        int x;
        try {
            x = Integer.parseInt(args[0]);
        } catch(RuntimeException e) {
            System.out.println("Input error");
            return;
        }
        TripleExpression expr = new ExpressionParser().parse("-1 clear -1");
        System.out.println(expr.evaluate(x, 0, 0));
    }
}
