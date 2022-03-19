package ParacticeSession01;

import java.util.Scanner;

public class Quadrant {
    /*
    Take 2 numbers from the user and tell them in which quadrant he/she is present
        1st positive, 2nd positive
        1st  negative, 2nd positive
        1st  positive, 2nd negative
        1st  negative, 2nd negative
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st integer Number:");
        int num1=scan.nextInt();
        System.out.println("Enter 2nd integer Number:");
        int num2=scan.nextInt();

        if(num1 >= 0 && num2 >= 0){
            System.out.println(num1+" and "+num2+" are present in 1st Quadrant");
        }else if(num1 < 0 && num2 >= 0){
            System.out.println(num1+" and "+num2+" are present in 2nd Quadrant");
        }else if(num1 >= 0 && num2 < 0){
            System.out.println(num1+" and "+num2+" are present in 3rd Quadrant");
        }else if(num1 < 0 && num2 < 0){
            System.out.println(num1+" and "+num2+" are present in 4th Quadrant");
        }
    }
}
