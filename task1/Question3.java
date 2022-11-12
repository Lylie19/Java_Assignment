package task1;

//Sannner import
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        int userInput;

        System.out.println("Enter an integer to test its divisibility :");
        userInput = input.nextInt();// getting user input

        // calling the test methods in the main function
        test_0(userInput);
        test_1(userInput);
        test_2(userInput);
        test_3(userInput);
        test_4(userInput);
        test_5(userInput);
        test_6(userInput);
        test_7(userInput);
        test_8(userInput);
        test_9(userInput);
    }

    /*
     * The following functions are used to test divisibility from 0-9.
     * They have been used in the main method
     */
    static void test_0(int num) {
        System.out.println(num + " can't be divisible by 0.");
    }

    static void test_1(int num) {
        System.out.println(num + " is divisible by 1. Any number divided by 1 will give the number itself");
    }

    static void test_2(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2. All even number are divisible by 2.");
        } else {
            System.out.println(num + " is not divisible by 2. All odd number are not divisible by 2.");
        }
    }

    static void test_3(int num) {
        if ((num % 3) == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }

    static void test_4(int num) {
        if ((num % 4) == 0) {
            System.out.println(num + " is divisible by 4");
        } else {
            System.out.println(num + " is not divisible by 4");
        }
    }

    static void test_5(int num) {
        if ((num % 5) == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }

    static void test_6(int num) {
        if ((num % 6) == 0) {
            System.out.println(num + " is divisible by 6");
        } else {
            System.out.println(num + " is not divisible by 6");
        }
    }

    static void test_7(int num) {
        if ((num % 7) == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is not divisible by 7");
        }
    }

    static void test_8(int num) {
        if ((num % 8) == 0) {
            System.out.println(num + " is divisible by 8");
        } else {
            System.out.println(num + " is not divisible by 8");
        }
    }

    static void test_9(int num) {
        if ((num % 9) == 0) {
            System.out.println(num + " is divisible by 9");
        } else {
            System.out.println(num + " is not divisible by 9");
        }
    }
}
