package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatements01 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int dayNumber = scan.nextInt();
        //1.way Solve by Using if else if statements
        if (dayNumber==1){
            System.out.println("Sunday");
        }else if(dayNumber==2){
            System.out.println("Monday");
        }else if(dayNumber==3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        }else if(dayNumber==5){
            System.out.println("Thursday");
        }else if(dayNumber==6){
            System.out.println("Friday");
        }else if(dayNumber==7){
            System.out.println("Saturday");
        }else{
            System.out.println("What kind of user ?Don't know about hte day number 1-7:");
        }
    //2.way Solve by using Switch
        //When to use Switch ? if you have more than 3 option Switch is Preferable;
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;//go outside Switch statements
            case 2:
                System.out.println("Monday");
                break;//go outside Switch statements
            case 3:
                System.out.println("Tuesday");
                break;//go outside Switch statements
            case 4:
                System.out.println("Wednesday");
                break;//go outside Switch statements
            case 5:
                System.out.println("Thursday");
                break;//go outside Switch statements
            case 6:
                System.out.println("Friday");
                break;//go outside Switch statements
            case 7:
            System.out.println("Saturday");
            break;//go outside Switch statements
            default:
                System.out.println("Invalid day Number");
        }

    }
}
