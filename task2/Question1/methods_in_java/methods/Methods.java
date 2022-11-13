package Question1.methods_in_java.methods;

//import Scanner
import java.util.Scanner;

public class Methods {

    // get the smallest number
    static double smallNum(double first_num, double second_num, double third_num) {

        if (first_num < second_num) {
            if (first_num < third_num) {
                // if true, return first_num
                return first_num;
            } else {
                // else false, return third_num
                return third_num;
            }
        } else {
            if (second_num < third_num) {
                // if true, return second_num
                return second_num;
            } else {
                // else false, return third_num
                return third_num;
            }
        }
    }

    // get largest number
    static double largeNum(double first_num, double second_num, double third_num) {

        if (first_num > second_num) {
            if (first_num > third_num) {
                // if true, return first_num
                return first_num;
            } else {
                // else false, return third_num
                return third_num;
            }
        } else {
            if (second_num > third_num) {
                // if true, return second_num
                return second_num;
            } else {
                // else false, return third_num
                return third_num;
            }
        }
    }

    // main method
    public static void main(String[] args) {

        //
        double first_num, second_num, third_num, smallnum, largenum;

        Scanner input = new Scanner(System.in);// scanner object

        // input first number
        System.out.println("\nEnter the first number: ");
        first_num = input.nextInt();
        // input second number
        System.out.println("Enter the second number: ");
        second_num = input.nextInt();
        // input third number
        System.out.println("Enter the third number: ");
        third_num = input.nextInt();

        // get return values fom the methods
        smallnum = smallNum(first_num, second_num, third_num);
        largenum = largeNum(first_num, second_num, third_num);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }

}
