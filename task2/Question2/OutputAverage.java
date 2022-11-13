package Question2;

//importing Scanner
import java.util.Scanner;

public class OutputAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        double java_Marks, networking_Marks, math_Marks, average; // my variables

        System.out.println("Enter marks for -");
        
        // input java marks
        System.out.println("Java Programming: ");
        java_Marks = input.nextInt(); 
        // input networking marks
        System.out.println("Networking: ");
        networking_Marks = input.nextInt(); 
        // input maths marks
        System.out.println("Maths: ");
        math_Marks = input.nextInt(); 

        // output
        System.out.println("\nMarks for Java Programming is: " + java_Marks);
        System.out.println("Marks for Networking: " + networking_Marks);
        System.out.println("Marks for Maths: " + math_Marks);

        // calculate the average
        average = (java_Marks + networking_Marks + math_Marks) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
