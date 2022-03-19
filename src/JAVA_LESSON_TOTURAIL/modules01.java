package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class modules01 {
    public static void main(String[] args) {

        /*
        Type a program like;
            Ask user to enter two integer values, the first will be greater than the second.
            The remainder when you divide the first by the second will be the width,
            and the sum of the two numbers will be the length of a rectangle.
            Then calculate the area and the perimeter of the rectangle, and print them
            on the console.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the First Integer:");
        int st1=scan.nextInt();
        System.out.println("Please Enter the Second Integer:");
        int st2=scan.nextInt();
        System.out.println("First Integer:"+st1);
        System.out.println("Second integer:"+ st2);
        int width=st1/st2;
        int length=st1+st2;
        System.out.println("The Width:"+width);
        System.out.println("The Length:"+length);

        int area=width*length;
        System.out.println("The area of rectangle:"+area);
        int pr=2*width*length;
        System.out.println("The Pre-metre of rectangle:"+pr);





    }
}
