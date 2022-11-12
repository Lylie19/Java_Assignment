package task1;

//Scanner import
import java.util.Scanner;

public class Question1 {

    //main method
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        String sir_name, oddOReven;
        int age, numCharacters;

        System.out.println("Enter your surname :");
        sir_name = input.nextLine(); // input the name
        
        System.out.println("Enter your age :");
        age = input.nextInt(); // input the age
        // Finding number of char in surname
        numCharacters = sir_name.length();
        //if the moduus of age by 2 is zero
        if (age % 2 == 0) {
            //age is even
            oddOReven = "even";
        } else {
            //age is odd
            oddOReven = "odd";
        }
        // Display output
        System.out.println("Your sir name has : " + numCharacters + " characters");
        System.out.println("Your current age is an " + oddOReven + " number.");
    }
}