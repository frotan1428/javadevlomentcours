package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book06 {
        //Type a program like; given an array whose length is 3, return an array with the
        //elements "rotated left"[3,2,1]  [1,2,3]
    public static void main(String[] args) {
        int myArray[]={3,2,1};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));


    }
}
