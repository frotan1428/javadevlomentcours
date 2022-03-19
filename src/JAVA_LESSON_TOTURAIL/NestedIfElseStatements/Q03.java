package JAVA_LESSON_TOTURAIL.NestedIfElseStatements;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


        /*
        Type java code by using nested if() statement.
                Ask user to enter a password
                If the initial of the password is uppercase then check if it is ‘A’ or not.
                If it is ‘A’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
                If the initial of the password is lowercase then check if it is ‘z’ or not.
                If it is ‘z’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter A String");
        String pwd=scan.nextLine();

        char FirstChar=pwd.charAt(0);

        if (FirstChar>='A' && FirstChar <='Z'){
            if (FirstChar=='A'){
                System.out.println("Valid password");
            }else if (FirstChar=='Z'){
                System.out.println("Invalid Password");
            }else if (FirstChar>='a' && FirstChar<='z'){
                if (FirstChar=='z'){
                    System.out.println("valid password");
                }else{
                    System.out.println("Not Valid password");

                }
            }else{
                System.out.println("You Enter Wrong password");
            }
        }

    }
}
