package JAVA_LESSON_TOTURAIL.StringManipulation;

public class Sm01 {

    public static void main(String[] args) {


        String str = "Ali! is 13 years old, I think he is 15.";

        String noSpace=str.replaceAll(" ", "");
        System.out.println(noSpace);
        String noDigit=str.replace("[0-9]","*");
        System.out.println(noDigit);

        String noLetters = str.replaceAll("[^a-z-A-Z]", "!");
        System.out.println(noLetters);

        String differentFromDigits = str.replaceAll("[^0-9]","*");
        System.out.println(differentFromDigits);

        //  "Ali! is 13 years old, I think he is 15.";
        int totalNumberOfCharacters = str.length();
        int numOfCharsDiffFromPunctuationMarks = str.replaceAll("\\p{Punct}", "").length();
        int numOfPunctuationMarks = totalNumberOfCharacters - numOfCharsDiffFromPunctuationMarks;
        System.out.println(numOfPunctuationMarks);



    }
}
