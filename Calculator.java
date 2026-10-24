/*
* Title of Class: Calculator
* Author's Name: Charlotte Collard
* Purpose: To create a class that houses the addition, subtraction, division, and multiplication methods.
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/

//package ClassCreationCalculator;

public class Calculator {
    /*private int a;
    private int b;
    private int s;
    private int d;
    private int p;
    private int q;
    private double s2;
    private double d2;
    private double p2;
    private double q2;*/
    

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    /*public String add(double a, double b) {
        s2 = a + b;
        return s2 + " = " + a + " + " + b;
    }

    public String subtract(double a, double b) {
        d2 = a - b;
        return d2 + " = " + a + " - " + b;
    }

    public String multiply(double a, double b) {
        p2 = a * b;
        return p2 + " = " + a + " * " + b;
    }

    public String divide(double a, double b) {
        q2 = a / b;
        return q2 + " = " + a + " / " + b;
    } */
}
