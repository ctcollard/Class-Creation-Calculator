//package ClassCreationCalculator;

public class Calculator {
    private int a;
    private int b;
    private int s;
    private int d;
    private int p;
    private int q;

    public String add(int a, int b) {
        s = a + b;
        return s + " = " + a + " + " + b;
    }

    public String subtract(int a, int b) {
        d = a - b;
        return d + " = " + a + " - " + b;
    }

    public String multiply(int a, int b) {
        p = a * b;
        return p + " = " + a + " * " + b;
    }

    public String divide(int a, int b) {
        q = a / b;
        return q + " = " + a + " / " + b;
    }

    /*public String add(double a, double b) {
        s = a + b;
        return s + " = " + a + " + " + b;
    }

    public String subtract(double a, double b) {
        d = a - b;
        return d + " = " + a + " - " + b;
    }

    public String multiply(double a, double b) {
        p = a * b;
        return p + " = " + a + " * " + b;
    }

    public String divide(double a, double b) {
        q = a / b;
        return q + " = " + a + " / " + b;
    } */
}
