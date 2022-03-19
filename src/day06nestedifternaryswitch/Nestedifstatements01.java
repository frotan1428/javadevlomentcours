package day06nestedifternaryswitch;

import java.util.Scanner;

public class Nestedifstatements01 {
    public static void main(String[] args) {

        /*

        If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a pasword....:");
        String pwd = scan.nextLine();

        //how to get the fit=rst Character from a string
        /*
            Note 1: If it is possible do not use nested-if because it has "time-complexity" means takes too much time to execute
         */
        System.out.println(pwd.charAt(0));
        /*
        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Valid Password");
            } else if (pwd.charAt(0) == 'Z') {
                System.out.println("Invalid Password");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid Password First Character Must be Letter");
        }
         */
        char firstChar=pwd.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z') {
            if (firstChar== 'A') {
                System.out.println("Valid Password");
            } else if (firstChar == 'Z') {
                System.out.println("Invalid Password");
            }
        } else if (firstChar>= 'a' && firstChar <= 'z') {
            if (firstChar == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid Password First Character Must be Letter");
        }
    }
}
