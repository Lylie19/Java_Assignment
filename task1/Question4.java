package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question4 {

    // This method will output a list of multiples of 2
    static void multiplesOf2(List<Integer> mainList) {
        System.out.println("\n\n2 has the multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 2 == 0) {
                System.out.println(mainList.get(i));
              
            }
              if (i == 150 - 71) {
                    break;
                }
        }
    }

    // This method will output a list of multiples of 3
    static void multiplesOf3(List<Integer> mainList) {
        System.out.println("\n\n3 has the multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 3 == 0) {
                System.out.println(mainList.get(i));

               
            }
              if (i == 150 - 71) {
                    break;
                }

        }
    }

    // This method will output a list of multiples of 7
    static void multiplesOf7(List<Integer> mainList) {
        System.out.println("\n\n7  has the multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 7 == 0) {
                System.out.println(mainList.get(i));
            }
              if (i == 150 - 71) {
                    break;
              }

        }
    }

    // main method
    public static void main(String[] args) {

        // This list holds 71-149
        List<Integer> mainList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        mainList.add(150); // adding last item

        // calling my methods to print the output
        multiplesOf2(mainList);
        multiplesOf3(mainList);
        multiplesOf7(mainList);
    }
}
