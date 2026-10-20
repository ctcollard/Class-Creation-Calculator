//package ClassCreationCalculator;

public class Test extends Calculator {
    
    public static void main(String[] args) {
        System.out.println("Welcome to your calculator!");

        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(9,3));
        System.out.println(myCalc.subtract(9,3));
        System.out.println(myCalc.multiply(9,3));
        System.out.println(myCalc.divide(9,3));

    }
    
}
