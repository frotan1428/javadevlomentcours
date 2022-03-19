package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {


        String st1="MohammadFrotan";

        String arr[]=st1.split("");
        System.out.println(Arrays.toString(arr));

        //Please split this name into a char array.
        char array [] = st1.toCharArray();//char
        System.out.println("Char array => " + Arrays.toString(array));


    }
}
