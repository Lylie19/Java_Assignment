package part_1;

import java.util.Scanner; //importing Scanner

public class QuestionTwo {
    
    // Scanner object
    static Scanner input = new Scanner(System.in);

    // the main method that shows prime numbers between 1 to 500.
    public static void main(String[] args) {

        int i = 0;
        int myNumber = 0;
        String primeNums = "";

        for (i = 1; i <= 500; i++) {
            int counter = 0;
            for (myNumber = i; myNumber >= 1; myNumber--) {
                if (i % myNumber == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNums = primeNums + i + " ";
            }
        }
        System.out.println("The prime numbers from 1 to 500 are :");
        System.out.println(primeNums);

        // calling the isPrime method in the main method
        isPrime();
    }

    // A prime number is a number that is evenly divisible only by itself and 1
    static void isPrime() {

        System.out.println("Enter an integer number to test if it is prime number: ");
        var numberToTest = input.nextInt();

        boolean flag = false;
        for (int i = 2; i <= numberToTest / 2; ++i) {
            // condition for nonprime number
            if (numberToTest % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(numberToTest + " is a prime number.");
        else
            System.out.println(numberToTest + " is not a prime number.");

    }
}