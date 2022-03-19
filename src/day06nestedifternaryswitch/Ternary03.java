package day06nestedifternaryswitch;

public class Ternary03 {
    public static void main(String[] args) {

        //Type code to calculate the absolute value of a number
        //For positive numbers nad zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1
        double num = -1;
        double absoluteValue = num>0 ?  num : -1*num;
        System.out.println(absoluteValue);

    }
}
