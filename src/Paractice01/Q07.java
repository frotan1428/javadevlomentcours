package Paractice01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Hol old are you?:");
        int age=scan.nextInt();
        System.out.println("Enter Gender:");
        char gender =scan.next().toUpperCase().charAt(0);
        if (gender=='M' || gender=='F'){
            if (age>=18){
                if (gender=='M'){
                    System.out.println("Man");
                }else{
                    System.out.println("Women");
                }
            }else{
                if(gender=='M'){
                    System.out.println("Boy");
                }else{
                    System.out.println("Girls");
                }
            }
        }else {
            System.out.println("Invalid input");

        }

    }
}
