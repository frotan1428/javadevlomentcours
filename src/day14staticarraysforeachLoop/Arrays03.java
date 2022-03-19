package day14staticarraysforeachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
            //create an array by getting array elements by user
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hoe many element You Store inside the array ");
        int len=scan.nextInt();

        String sArray[]=new String[len];


       /*
        for ( int i=0;i<len;i++){
            System.out.println("Enter String :");
            String el=scan.next();
            sArray[i]=el;
        }
        System.out.println(Arrays.toString(sArray));
        */ // also work

        for ( int i=0;i<len;i++){
            System.out.println("Enter String :");
            sArray[i]=scan.next();

        }
        System.out.println(Arrays.toString(sArray));

    }
}
