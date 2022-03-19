package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifElseStatementQ5 {
    public static void main(String[] args) {

        /*
        Ask user ta enter any name of the week, then get second ,fourth,
            and sixth letter of the day name and print them on the console,
            in the same line.
            For example; if the user enters “Monday” output will be “ody”
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please Enter A dayName:");
        String dayName=scan.next();
        char isNewChar=dayName.charAt(0);
        if (dayName.equals("Monday") && dayName.equals("Friday")){
            System.out.print("ody");
        }else{
            System.out.print("udy");
        }
    }
}
