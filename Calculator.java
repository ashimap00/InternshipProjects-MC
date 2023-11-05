package motioncut;
import java.util.Scanner;
public class Calculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();        
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result;
        
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;}
        System.out.println("Result: " + result);
    }}


    

