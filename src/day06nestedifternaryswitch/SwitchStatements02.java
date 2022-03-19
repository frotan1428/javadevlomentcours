package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatements02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int sessionNumber = scan.nextInt();
        switch (sessionNumber) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Fall");
                break;
            case 4:
                System.out.println("Winter");
                break; // This is optional
            default:
                System.out.println("Invalid Session");
        }
    }

}
