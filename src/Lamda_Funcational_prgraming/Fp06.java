package Lamda_Funcational_prgraming;

import java.util.stream.IntStream;

public class Fp06 {

    public static void main(String[] args) {

        System.out.println(getSumFrom7To100());
        System.out.println(getSumFrom7To10002());
        System.out.println(getProduct());
        System.out.println(getFactorial());
        System.out.println(CalculateTheFactorial(5));
    }
    //1)Create a method to find the sum of integers from 7 to 100
    // 1way:
    public static int getSumFrom7To100(){
        //this InStream does the same actions as for loop does in Structure programing
       return   IntStream.range(7,101).reduce(0,Math::addExact);

    }
    public static int getSumFrom7To10002(){
        //this InStream does the same actions as for loop does in Structure programing
        return   IntStream.rangeClosed(7,100).reduce(0,Math::addExact);

    }
    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getProduct(){
         return  IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    //4)Create a method to calculate the sum of even integers between given two integers

    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
// 1way:
    public static int getFactorial(){
        return IntStream.rangeClosed(1,5).reduce(1,Math::multiplyExact);
    }

    //2 way:
    public static  Object CalculateTheFactorial(int x){

         return x>0 ? IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact): "Do not use Negative ";
    }


}
