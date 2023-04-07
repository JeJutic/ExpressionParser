package expression;

public class Main {
    public static void main(String[] args) {
        int x;
        try {
            x = Integer.parseInt(args[0]);
        } catch(RuntimeException e) {
            System.out.println("Input error");
            return;
        }

        Expression expr = new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        )
                ),
                new Const(1)
        );
        System.out.println(expr.evaluate(x));
    }
}
