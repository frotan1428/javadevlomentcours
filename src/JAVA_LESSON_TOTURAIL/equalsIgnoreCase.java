package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        System.out.println("Please Enter First String");
        Scanner scan=new Scanner(System.in);
        String st1=scan.next();
        System.out.println("Please Enter Second String");
        String st2=scan.next();
        if (st1.equalsIgnoreCase(st2)){
            System.out.println("They Are equals String");
        }else{
            System.out.println("Try aign");
        }


    }
}
