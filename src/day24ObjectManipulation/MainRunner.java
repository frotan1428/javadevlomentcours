package day24ObjectManipulation;

import java.util.Scanner;

public class MainRunner {

    public static void main(String[] args) {

        /*
            Type a program that ask user their name and lastname ,then Create an email for the user
            concatenate the name and lastname then add @gmail.com
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name and last name to see your email");

        String name=scan.nextLine();
        String lastname=scan.nextLine();
        System.out.println("person name:" +name);
        System.out.println("person lastname:"+lastname);
        System.out.println("Person's email :" + getEmail(name,lastname));


    }

    public static String getEmail (String name,String lastname){

        return (name+lastname+"@gmail.com").toLowerCase();

    }
}
