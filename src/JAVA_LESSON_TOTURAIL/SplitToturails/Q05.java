package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    //Find the vowels in a String by using arrays.
    // Print them on the console

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A String with vowels");
        String st=scan.nextLine();
        String array[]=st.split("");
        System.out.println(Arrays.toString(array));

        int counter=0;

        for (String w:array){

            if (w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||
                w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u")){
                System.out.print(w+" ");
                counter++;

            }

        }

        System.out.println();
        System.out.println("The number of vowels is : " + counter);


    }
}
