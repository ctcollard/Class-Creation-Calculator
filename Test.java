package ClassCreationCalculator;

public class Test extends Calculator {
    private int a;
    private int b;

    public static void main(String[] args) {
        System.out.println("Welcome to your calculator!");

        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(3,4));

    }
    
}
