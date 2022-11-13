package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class TriangleArea {

    //these variables are available for this class
    static double triangle_Base, triangle_Height, area;

        // main method
        public static void main(String[] args) {

            // calling the non-static methods by creating the object of this class
            TriangleArea objectOfThisClass = new TriangleArea();
            objectOfThisClass.doInputs();
            objectOfThisClass.getArea();
            objectOfThisClass.outputResults();
        }

    // input the triangle_Base and the triangle_Height
    void doInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle: ");
        triangle_Base = input.nextDouble(); // store the input in triangle_Base
        System.out.println("Enter the height of the triangle: ");
        triangle_Height = input.nextDouble(); // store the input in triangle_Height
    }

    // get the area of the rectangle
    void getArea() {
        area = 1/2 * triangle_Base * triangle_Height;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area of our triangle is: " + area);
    }


}
