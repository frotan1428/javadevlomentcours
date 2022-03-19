package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        //1.way solve by using if-else ststemnets
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check its sign:");
        int num=scan.nextInt();

        if (num>0){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }
        //2.way Ternary
        // 1-Condition 2-Question mark 3-:Result for happy scenario 4-colon:  5-negative scenario;
        String result=num>0       ?     "Positive"      :   "Negative";

        System.out.println(result);



    }
}
