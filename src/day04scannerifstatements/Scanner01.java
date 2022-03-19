package day04scannerifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        type a program to calculate the volume of rectangular prism who length,width,height.
        Hint:volume of rectangle= width*height*length;
         */
        System.out.println("Enter the length :");
        double length=scan.nextDouble();
        System.out.println("Enter the width:");
        double width=scan.nextDouble();
        System.out.println("Enter the height:");
        double height=scan.nextDouble();
        System.out.println("The volume of rectangle is:"+length*width*height);



    }
}
