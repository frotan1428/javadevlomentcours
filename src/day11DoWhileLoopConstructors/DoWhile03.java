package day11DoWhileLoopConstructors;

import java.util.Scanner;

public class DoWhile03 {

    public static void main(String[] args) {

        /*
	 	Username ise “admin”, Password is “pwd123"
	 	Ask user to enter username and password
	 	User should see “Enter your username and password” message
	 	If he enters correct credentials he should get “You are in your account!” message

	 	Otherwise, he should see “Enter your username and password” message 3 times

	 	After 3 times he should get “Your account is blocked” message



	 	Not: use break in switch and Do wile loop.
	 */
        Scanner scan=new Scanner(System.in);
        String userName="";
        String pasWord="";
        int counter=0;
        do {
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Please Enter Username");
            userName=scan.next();
            System.out.println("Please Enter password");
            pasWord=scan.next();
            if (userName.equals("admin") && pasWord.equals("pwd123") ){
                System.out.println("You are in Your account");
                break;
            }
            counter++;

        }while (counter<4);

    }
}
