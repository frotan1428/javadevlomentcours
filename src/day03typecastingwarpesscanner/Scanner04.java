package day03typecastingwarpesscanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the width and height of rectangle");
        int width= scan.nextInt();
        int height= scan.nextInt();
        System.out.println("The area of rectangles : "+ width*height);
        System.out.println("The pre meter of rectangles : "+ 2*(width*height));

    }
}
