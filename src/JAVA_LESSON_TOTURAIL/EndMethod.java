package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class EndMethod {
    public static void main(String[] args) {
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter any String");
        String St=scan.nextLine();

        boolean isNew=St.endsWith(St);
        System.out.println(isNew);

         */
        System.out.println("Please Enter any String");
        Scanner scan=new Scanner(System.in);
        String St=scan.nextLine().toUpperCase();

        boolean isNew=St.endsWith("FRO");
        System.out.println(isNew);
        boolean isNew2=St.startsWith("TAN",3);
        System.out.println(isNew2);
    }
}
