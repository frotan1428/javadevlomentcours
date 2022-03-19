package JAVA_LESSON_TOTURAIL;

public class concat02 {

    public static void main(String[] args) {

        int numA = 2;
        int numB = 3;
        String str1 = "Study";
        String str2 = "Hard";

        /*
        Type a program to see the following outputs on the console
        by using “concatenation” operation.
         */
       // A) Study Hard B) 5 Study C) Hard23 D) Hard1 :Note: Be careful about the spaces between the variables

        System.out.println(str1+" "+str2);          //Study Hard
        System.out.println((numA+numB)+" "+str1);   //5 Study
        System.out.println(str2+"2"+"3");            //Hard23
        System.out.println(str2+"1");                //Hard1


    }
}
