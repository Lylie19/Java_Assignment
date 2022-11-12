package task1;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double num1 , num2, result; 
        char mathSign;

        Scanner input = new Scanner(System.in); //Scanner object

        // request the first number from the user
        System.out.println("Enter the first number");
        num1 = input.nextDouble();

        // request the the mathSign from the user
        System.out.println("Type one of these signs as your operator: +, -, *, or /");
        mathSign = input.next().charAt(0);

        // request the second number from the user
        System.out.println("Enter second number");
        num2 = input.nextDouble();

        switch (mathSign) {

            // do the subtraction
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // do the addition
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // do the multiplication
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // do the division
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("You might have made an error. Please try again.");
                break;
        }
    }
}