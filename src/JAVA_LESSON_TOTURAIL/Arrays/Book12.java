package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book12 {

    public static void main(String[] args) {

        int number[]={ 2, 4, 6, 8 };

        Arrays.sort(number);
        System.out.println(Arrays.binarySearch(number,2));//0
        System.out.println(Arrays.binarySearch(number,7));//-4
        System.out.println(Arrays.binarySearch(number,3));//-2
        System.out.println(Arrays.binarySearch(number,9));//-5
    }
}
