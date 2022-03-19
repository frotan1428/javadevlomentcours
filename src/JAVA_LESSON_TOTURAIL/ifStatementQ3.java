package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifStatementQ3 {

    public static void main(String[] args) {

        /*
        Type java code by using if statement. When you enter the name of the day of a week,
            output will be “Weekday” or “Weekend day” according to the name of the day.
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter A day name");
        String dayName=scan.next();


        if (dayName.equals("Sunday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Friday")){
            System.out.println("weekend day");
        }


    }
}
