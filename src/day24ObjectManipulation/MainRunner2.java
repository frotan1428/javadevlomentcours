package day24ObjectManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {

        /*
            Type a program that ask user their name and lastname ,then Create an email for the user
            concatenate the name and lastname then add @gmail.com at the end
         */

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();


        List<String> lastname=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please 2 names:");

        names.add(scan.nextLine());
        names.add(scan.nextLine());



        System.out.println("Please 2 lastnames:");
        lastname.add(scan.nextLine());
        lastname.add(scan.nextLine());

        System.out.println("user name"+names);
        System.out.println("user lastname"+lastname);

        System.out.println("email is: "+ generateEmail(names,lastname));



    }

    public static List<String> generateEmail(List<String> names,List<String> lastname){

        List<String>  emails=new ArrayList<>();
      //  emails.add(names.get(0)+(lastname.get(0))+"@gmail.com");
      //  emails.add(names.get(1)+(lastname.get(1))+"@gmail.com");
        for (int i=0;i<names.size();i++){
              emails.add((names.get(i)+lastname.get(i)+"@gmail.com").toLowerCase());
        }

        return emails;

    }
}
