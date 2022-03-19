package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

            //1)Get string from user and type code to find the number of words in a String.
        //2)Count how many words starts with "a".(Make code case-sensitive)

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A String");
        String st=scan.nextLine();
        String array[]=st.split(" ");
        System.out.println(Arrays.toString(array));

        System.out.println("The length of word: "+array.length);

        int counter=0;
        for (String w:array){
            if (w.endsWith("a")){
                counter++;
            }

        }
        System.out.println(counter);


    }
}
