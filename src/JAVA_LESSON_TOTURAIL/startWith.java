package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class startWith {
    public static void main(String[] args) {

        System.out.println("Please Enter any String");
        Scanner scan=new Scanner(System.in);
        String St=scan.nextLine().toUpperCase();

        boolean isNew=St.startsWith("H");
        System.out.println(isNew);
        boolean isNew2=St.startsWith("F",2);
        System.out.println(isNew2);
        if (isNew){
            System.out.println(isNew);
        }
        if (isNew2){
            System.out.println(isNew2);
        }else{
            System.out.println("INVALID STRINGS");
        }
    }
}
