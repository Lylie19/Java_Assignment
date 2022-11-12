package task1;

import java.util.Scanner; //importing Scanner

public class Question2 {
  
    //main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //my Scanner object
            
        //my variables
        double unitOne, unitTwo, unitThree, unitFour, unitFive, average;
        
            System.out.println("To get your average marks for last semester ");
            //inputting the five units
            System.out.println("\nEnter marks for unit 1 : ");
            unitOne = input.nextDouble();
            System.out.println("Enter marks for unit 2 : ");
            unitTwo = input.nextDouble();
            System.out.println("Enter marks for unit 3 : ");
            unitThree = input.nextDouble();
            System.out.println("Enter marks for unit 4 : ");
            unitFour = input.nextDouble();
            System.out.println("Enter marks for unit 5 : ");
            unitFive = input.nextDouble();

            //getting average mark by calling getAverage method
            average = getAverage(unitOne, unitTwo, unitThree, unitFour, unitFive);

            //Dispalying output
            System.out.println("\nAverage mark : " + average);
        }

    static double getAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {
        //finding the average
        var myAverage = (unit1 + unit2 + unit3 + unit4 + unit5) / 5; 
        //rounding the average
        var roundAverage = Math.round(myAverage * 100.0) / 100.0; 
        return roundAverage;
    }
}