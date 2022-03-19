package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;
import java.util.Comparator;

public class Q07 {

    public static void main(String[] args) {


        // Find the longest word in a String

        String s = "Ali Can went to school to learn";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        System.out.println("The longest Word is: "+arr[arr.length-1]);
        System.out.println("The shortest Word is: "+arr[0]);



    }
}
