/*
* Title of Class: Test
* Author's Name: Charlotte Collard
* Purpose: To create a class in which I can test out values to see if my code works. 
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package ClassCreationcalculator;
import java.util.Scanner;

public class Test extends Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your calculator!");
        System.out.println("Please input your data type, operator, and values. Separate your inputs with a single space.");
        String dataType = input.next();
        String operator = input.next();

        /*Calculator myCalc = new Calculator();
        System.out.println(Calculator.add(3.5,2.5));
        System.out.println(Calculator.subtract(3.5,2.5));
        System.out.println(Calculator.multiply(3.5,2.5));
        System.out.println(Calculator.divide(3.5,2.5));*/
    

    if (dataType.equals("double")) {

    double value1 = input.nextDouble(); 
    double value2 = input.nextDouble();
    double result;

    if (operator.equals("+"))
        result = Calculator.add(value1, value2);
    else if (operator.equals("-"))
        result = Calculator.subtract(value1, value2);
    else if (operator.equals("*"))
        result = Calculator.multiply(value1, value2);
    else if (operator.equals("/"))
        result = Calculator.divide(value1, value2);
    else {
        System.err.println("Invalid operator.");
        input.close();
        return;
    }
    System.out.println("Your result is: " + result);
}

// Code block that deals with integers
else if (dataType.equals("integer")) {

    int value1 = input.nextInt();
    int value2 = input.nextInt();
    double result;

    if (operator.equals("+"))
        result = Calculator.add(value1, value2);
    else if (operator.equals("-"))
        result = Calculator.subtract(value1, value2);
    else if (operator.equals("*"))
        result = Calculator.multiply(value1, value2);
    else if (operator.equals("/"))
        result = Calculator.divide(value1, value2);
    else {
        System.err.println("Invalid operator.");
        input.close();
        return;
    }
    System.out.println("Your result is: " + result);
} 

// Code block to deal with a non-valid data type input
else {
    System.err.println("Data type incompatible - exiting program.");
}
    input.close();
}
}
