package JAVA_LESSON_TOTURAIL;

public class concat03 {
    public static void main(String[] args) {

        int numA = 2;
        int numB = 3;
        String str1 = "Study";
        String str2 = "Hard";
        /*
        Type a program to see “61Study-1” as output on the console
            by using “concatenation” operation. Note: Use just variable names, do not use any number
         */
        //1.way
        System.out.println("61"+str1+"-1"); //61Study-1
        //2.way:

        System.out.println((numA*numB)+""+(numB-numA)+str1+(numA-numB));
    }
}
