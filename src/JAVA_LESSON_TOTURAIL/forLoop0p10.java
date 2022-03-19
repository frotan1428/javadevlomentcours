package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class forLoop0p10 {
    public static void main(String[] args) {

        //we will Find the Factorial number :5
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a positive Number");

        int number=scan.nextInt();
         int fact=1;
        for (int i=1; i<=number; i+=1){
            fact=fact*i;

        }
        System.out.println("Factorials of:"+number+" is:"+fact);
    }
}
