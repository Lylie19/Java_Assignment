package part_1;

//importing Arrays
import java.util.Arrays; 

// importing Scanner
import java.util.Scanner; 



class QuestionOne {
    static Scanner input = new Scanner(System.in);


    private static void check(int[] arr, int number) {

        // using Linear Search method
        boolean test = false;
        for (int num : arr) {

            // check if the input number is in the array
            if (num == number) {
                test = true;
                break;
            }

        }

        // Print the result
        if (test) {
            System.out.println(number + " is in the array.");
        } else {
            System.out.println(number + " is not in the array.");
        }

    }

    //main function
    public static void main(String[] args) {

        // creating my array and placing zero upto index 14
        int[] myArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // get data from the user, that is 15 numbers
        System.out.println("\nEnter 15 numbers to our array: ");

        //Storing the values
        myArray[0] = input.nextInt(); 
        myArray[1] = input.nextInt();
        myArray[2] = input.nextInt();
        myArray[3] = input.nextInt();
        myArray[4] = input.nextInt();
        myArray[5] = input.nextInt();
        myArray[6] = input.nextInt();
        myArray[7] = input.nextInt();
        myArray[8] = input.nextInt();
        myArray[9] = input.nextInt();
        myArray[10] = input.nextInt();
        myArray[11] = input.nextInt();
        myArray[12] = input.nextInt();
        myArray[13] = input.nextInt();
        myArray[14] = input.nextInt();

        // converting the array to a string list.
        var myList = Arrays.toString(myArray);


        // display the array to the user as a list.
        System.out.println("Our array has the following values: " + myList);
        

        System.out.println("Enter any number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(myArray, numInput);

    }

    
}