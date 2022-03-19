package day04scannerifstatements;

import java.util.Scanner;

public class ifStatements03 {
    public static void main(String[] args) {

        //Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        // print "Weekend Day" for Saturday and Sunday

        //Note:To Compare 2 String do not use "==" it. result will be wrong
        //Note :.equal is used for string not used ==;


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Day name:");
        String dayName=scan.next();

        //Following codes are work
        if (dayName.equals("Monday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Tuesday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Wednesday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Thursday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Friday")){
            System.out.println("weekday");
        }
        if (dayName.equals("Saturday")){
            System.out.println("Weekend");
        }
        if (dayName.equals("Sunday")){
            System.out.println("Weekend");
        }
        //Solve the previous task without reparation.
        // Note: in java there is OR operation sign is ||
        if (dayName.equalsIgnoreCase("Monday")||
                dayName.equalsIgnoreCase("Tuesday")||
                dayName.equalsIgnoreCase("Wednesday")||
                dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday")){
            System.out.println("weekday");
        }
        if (dayName.equalsIgnoreCase("Saturday")||
                dayName.equalsIgnoreCase("sunday")){
            System.out.println("Weekend");
        }


        boolean isWeekday=dayName.equalsIgnoreCase("Saturday")||
                dayName.equalsIgnoreCase("sunday");
        if (isWeekday){
            System.out.println("Weekend");
        }


    }
}
