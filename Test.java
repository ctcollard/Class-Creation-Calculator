//package ClassCreationcalculator;
import java.util.Scanner;

public class Test extends Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your calculator!");
        System.out.println("Please input your data type, operator, and values. Separate your inputs with a single space.");
        String dataType = input.nextLine();
        String operator = input.nextLine();
        int intValue1 = input.nextInt();
        int intValue2 = input.nextInt();
        double doubleValue1 = input.nextDouble();
        double doubleValue2 = input.nextDouble();
        input.close();

        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(3.5,2.5));
        System.out.println(myCalc.subtract(3.5,2.5));
        System.out.println(myCalc.multiply(3.5,2.5));
        System.out.println(myCalc.divide(3.5,2.5));
    

    if (dataType.equals("double")) {

    double value1 = input.nextDouble(); // your scanner object must be named input to avoid a mismatch or change the input object name to match your scanner object name
    double value2 = input.nextDouble();
    double result;

    if (operator.equals("+"))
        result = myCalc.add(value1, value2);
    else if (operator.equals("-"))
        result = myCalc.subtract(value1, value2);
    else if (operator.equals("*"))
        result = myCalc.multiply(value1, value2);
    else if (operator.equals("/"))
        result = myCalc.divide(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
}

// Code block that deals with integers
else if (dataType.equals("integer")) {

    int value1 = input.nextInt();
    int value2 = input.nextInt();
    int result;

    if (operator.equals("+"))
        result = myCalc.add(value1, value2);
    else if (operator.equals("-"))
        result = myCalc.subtract(value1, value2);
    else if (operator.equals("*"))
        result = myCalc.multiply(value1, value2);
    else if (operator.equals("/"))
        result = myCalc.divide(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
} 

// Code block to deal with a non-valid data type input
else {
    System.err.println("Data type incompatible - exiting program.");
}
    
}
}
