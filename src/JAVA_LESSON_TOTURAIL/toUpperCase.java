package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class toUpperCase {
    public static void main(String[] args) {

        System.out.println("Please Enter any String");
        Scanner scan=new Scanner(System.in);
        String st1=scan.next().toUpperCase();
        System.out.println("This is UPPER CASE:"+st1);

    }
}
