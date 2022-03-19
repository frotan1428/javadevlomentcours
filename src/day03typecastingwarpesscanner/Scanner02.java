package day03typecastingwarpesscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Full name:");
        String fullName=scan.nextLine(); //to get String data from user use next line() getData.
        String LastName=scan.nextLine(); //to get String data from user use next line() getData.
        System.out.println("The username :"+fullName+" "+LastName);


    }
}
