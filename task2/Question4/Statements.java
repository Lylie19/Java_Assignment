package Question4;

public class Statements {

    // non static method
    void appendWords(String sentence_one, String sentence_two) { 
        
        System.out.println(sentence_one + sentence_two);
    }

    // This is a static method
    static String getSecondSentence() { 
        return " rain today.";
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;
        
        // calling a static method
        sentence_one = "It will";
        sentence_two = getSecondSentence();

        // using non-static method
        Statements objOfThisClass = new Statements();
        objOfThisClass.appendWords(sentence_one, sentence_two);
    }

}