package Paractice01;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

            /*
            Ask user to enter his kid's name,
            if the name contains both "a" and "z"  output will be "This name contains 'a'"
            if the name contains "a"               output will be "This name contains 'a'."
            if the name contains "z"               output will be "This name contains 'z'."
            Otherwise, output will be             "This name contains neither 'a' nor 'z'."
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Kid's name:");
        String kidsName=scan.nextLine().toLowerCase();

        if(kidsName.contains("a") && kidsName.contains("z") ){
            System.out.println("This name contains 'a' and 'z'");
        } else if (kidsName.contains("a")){
            System.out.println("This name contains 'a'");
        } else if (kidsName.contains("z")){
            System.out.println("This name contains 'z'");
        } else {
            System.out.println("This name contains neither 'a' nor 'z'");
        }


    }
}
