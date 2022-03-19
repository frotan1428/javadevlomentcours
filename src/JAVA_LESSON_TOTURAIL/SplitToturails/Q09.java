package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        //find the longest word in the given Stiring

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String");
        String st=scan.nextLine();

        String arr[]=st.split(" ");

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        System.out.println("the Longest word is:"+arr[arr.length-1]);
        System.out.println("The Smallest word is:"+arr[0]);



    }
}
