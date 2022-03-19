package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class lengthOfCount {
    public static void main(String[] args) {
        System.out.println("please Enter any Statements:  ");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int length=str.length();
        System.out.println("Total Character is:"+length);

    }
}
