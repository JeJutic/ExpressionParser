package expression.exceptions;

import expression.TripleExpression;
import expression.parser.ParsingException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("4 arguments expected, found " + args.length);
            return;
        }
        int x;
        int y;
        int z;
        try {
            x = Integer.parseInt(args[1]);
            y = Integer.parseInt(args[2]);
            z = Integer.parseInt(args[3]);
        } catch (RuntimeException e) {
            System.out.println("Input values parsing error");
            return;
        }

        try {
            TripleExpression expr = new ExpressionParser().parse(args[0]);
            System.out.println(expr);
            System.out.println(expr.evaluate(x, y, z));
        } catch (ParsingException e) {
            System.out.println(
                    "Parsing exception raised in args[0]: " + e.getMessage()
            );
        } catch (ArithmeticException e) {
            System.out.println(
                    "Arithmetic exception raised in args[0]: " + e.getMessage()
            );
        }
    }
}
