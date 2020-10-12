package math;

public class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");

        return a / b;
    }

    public static int circumference(int a, int b) {
        return add((multiply(a, 2)), (multiply(b, 2)));
    }
}
