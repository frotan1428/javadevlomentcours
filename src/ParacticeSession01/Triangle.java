package ParacticeSession01;

import java.util.Scanner;

public class Triangle {
//Take 3 inputs from the user for triangle 3 sides and tell whether
// it is equilateral isosceles and scalene triangle
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Measurement 1st side of triangle ");
        int side1=scan.nextInt();
        System.out.println("Please Enter Measurement 2nd side of triangle ");
        int side2=scan.nextInt();
        System.out.println("Please Enter Measurement 3th side of triangle ");
        int side3=scan.nextInt();

        //all sides are equal
        if(side1 == side2 && side2==side3){
            System.out.println("This is equilateral triangle!");
        }else if(side1 ==side2 || side1==side3 || side2==side3){
            //2 sides are equal
            System.out.println("This is isosceles triangle");
        }else{
            //no sides are equal
            System.out.println("This is scalene triangle");
        }

    }
}
