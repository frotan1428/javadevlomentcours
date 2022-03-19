package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book11 {



    /*
    If an element does not exist in array
             1) Find the index of the element if it exists
             2) Increase the index by 1
            3) Change the sign to negative
     */
    public static void main(String[] args) {

        int number[]={ 2, 4, 6, 8 };
        System.out.println(Arrays.binarySearch(number,1));
        System.out.println(Arrays.binarySearch(number,3));
        System.out.println(Arrays.binarySearch(number,9));

    }
}
