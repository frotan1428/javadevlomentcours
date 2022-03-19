package day04scannerifstatements;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Get the firstname, middle name, lastname, SSN from user then print them like the following

	 	Ali Mert Can
	 	123456789
         */
        System.out.println("Enter the firstname :");
        String firstname=scan.nextLine();
        System.out.println("Enter the midlename :");
        String midlename=scan.nextLine();
        System.out.println("Enter lastname :");
        String lastname=scan.nextLine();
        System.out.println("Enter the SSN:");//nextline() takes all the strings next() takes just first word
        String ssn=scan.nextLine();
        System.out.println(firstname+" "+midlename+" "+lastname);
        System.out.println("SSN:"+ssn);


    }
}
