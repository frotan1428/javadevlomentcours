package day05ifeslestaements;

import java.util.Scanner;

public class elseIFstatemenst {
    public static void main(String[] args) {
        //week day:Monday,thursday,wends day,friday
        //Weekend Day:Sunday saturday

        //first condition => check the week days
        //second condition check the weekend days
        //final condition => check if it is a day or not
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell us any name of day");
        String day=scan.next();
        if (day.equalsIgnoreCase("Monday")||
                day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("wednesday") ||
                day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday")){
                System.out.println(day  + ":is week day");
        }else if (day.equalsIgnoreCase("sunday")||
                day.equalsIgnoreCase("Saturday")){
                System.out.println(day + "is weekend  day");
        }else {
            System.out.println("this is not a day");

        }
    }
}
