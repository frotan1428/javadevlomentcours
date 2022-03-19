package day03typecastingwarpesscanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner class is used Data form user in Java.

        // how will get data user?
        //1.step:

        Scanner scan = new Scanner(System.in);//scanner is an object. input name of object "New" is keyword create object from class

        // the class which the object will be created:Scanner(System.in)//data is inside we use in.
        //System mean call the put data
        //2.step
        System.out.println("Enter first age: "); // prompt
        //3.Step
        int age= scan.nextInt();    //read data from user.
        System.out.println("user Age:"+age);


    }
}
