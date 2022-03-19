package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class isEmpty {

    public static void main(String[] args) {

        System.out.println("Please enter any Fullname");
        Scanner scan=new Scanner(System.in);
        String fullName= scan.nextLine();
        //1.way
        boolean isEmpty = fullName.isEmpty();
        if(isEmpty){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");
        }
        //2.way
        int numOfChar = fullName.length();
        if(numOfChar==0){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");
        }
    }
}
