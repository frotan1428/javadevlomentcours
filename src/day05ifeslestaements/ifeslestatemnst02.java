package day05ifeslestaements;

import java.util.Scanner;

public class ifeslestatemnst02 {
    public static void main(String[] args) {


        //December January february===>winter  1.condition
        //march,april,may----->spring  2.condition
        //jun,july,august---->summer  3.condition
        //september, october,november---->fall 4.condition
        //else final condition 5.condition
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Name of The Year:");
        String month=input.next();
        if (month.equalsIgnoreCase("December")||
                month.equalsIgnoreCase("january")||
                month.equalsIgnoreCase("february")){

            System.out.println(month+"The Sessionju is Winter");
        }else if(month.equalsIgnoreCase("march")||
                month.equalsIgnoreCase("april")||
                month.equalsIgnoreCase("may")){

            System.out.println(month+"The Session is Spring");
        }else if(month.equalsIgnoreCase("jun")||
                month.equalsIgnoreCase("july")||
                month.equalsIgnoreCase(month+"august")) {

                System.out.println("The Session is summer");
        }else if(month.equalsIgnoreCase("september")||
                month.equalsIgnoreCase("october")||
                month.equalsIgnoreCase("november")) {
            System.out.println(month+"The Session is Fall");

        }else {
            System.out.println(month+ " is not actually a MONTH of the year");
        }

    }
}
