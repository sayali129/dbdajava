

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
       
        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
       
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
       
        // Calculate the sum
        double sum = num1 + num2;
       
        // Display the result
        System.out.println("The sum is: " + sum);

	double sub=num1-num2;
	System.out.println("The subtraction is: "+sub);

        // Close the scanner
        scanner.close();
    }
}

	
