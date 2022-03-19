package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifElseStatementQ3 {
    public static void main(String[] args) {

        /*

        Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
         then output will be “Hey man you retired!” else output will be “No need to work”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Age:");
        int age=scan.nextInt();
        int male=scan.nextInt();

        if (male>65){
            System.out.println("male");
        }if (age>65){
            System.out.println("Hey man you retired!");
        }
        else{
            System.out.println("No need to work");
        }

    }
}
