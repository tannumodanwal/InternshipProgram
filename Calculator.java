package Solution;

import java.util.Scanner;

public class Calculator {


    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("\n--- Java Console Calculator ---");
	            System.out.print("Enter first number: ");
	            double num1 = s.nextDouble();

	            System.out.print("Enter operator +, -, *, / : ");
	            char operator = s.next().charAt(0);

	            System.out.print("Enter second number: ");
	            double num2 = s.nextDouble();

	            double result = 0;
	            switch (operator) {
	                case '+':
	                    result = add(num1, num2);
	                    break;
	                case '-':
	                    result = subtract(num1, num2);
	                    break;
	                case '*':
	                    result = multiply(num1, num2);
	                    break;
	                case '/':
	                    result = divide(num1, num2);
	                    break;
	                default:
	                    System.out.println("Invalid operator!");
	                    continue;
	            }

	            System.out.println("Result: " + result);

	            System.out.print("Do you want to perform another calculation? (yes/no): ");
	            String choice = s.next();

	            if (choice.equalsIgnoreCase("no")) {
	                running = false;
	                System.out.println("Calculator closed.");
	            }
	        }

	        s.close();

	}

}
