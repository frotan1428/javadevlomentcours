package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book13 {

    public static void main(String[] args) {
       String srr[]={"A","B","C","D","S"};
        Arrays.sort(srr);
        System.out.println(Arrays.binarySearch(srr,"A"));
        System.out.println(Arrays.binarySearch(srr,"X"));
        System.out.println(Arrays.binarySearch(srr,"E"));

        //print array
        System.out.println(Arrays.toString(srr));


    }
}
