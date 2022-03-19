package JAVA_LESSON_TOTURAIL.SwitchStatetment;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {


        /*

                            Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
            Then type a program by using “switch statement” to print “United” for ‘U’
            ” States” for ’S’, and “America” for ‘A’
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter sate:");
        String st=scan.next();

        switch (st){
            case "U":
                System.out.println("united");
                break;
            case "S":
                System.out.println("state");
                break;
            case "A":
                System.out.println("America");
                break;
            default:
                System.out.println("not Valid");
        }
    }
}
