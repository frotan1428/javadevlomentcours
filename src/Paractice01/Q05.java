package Paractice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is thr Price");
        int price =scan.nextInt();
        String decision = price <=10 ?   "It's Cheap" :price <=20 ? "it's ok" : "It's Expensive";
        System.out.println(decision);

        
    }
}
