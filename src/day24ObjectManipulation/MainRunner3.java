package day24ObjectManipulation;

import java.util.Scanner;

public class MainRunner3 {


  /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate  firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */


    public static void main(String[] args) {

      //  Person person=new Person();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your name and Lastname");

        Person person = new Person(scan.nextLine(), scan.nextLine());
        System.out.println("Email of the person: " +generateEmail(person));


    }

    public static String generateEmail(Person person){

        System.out.println();

        return  (person.name + person.lastName+"@gmail.com").toLowerCase();

    }
}
