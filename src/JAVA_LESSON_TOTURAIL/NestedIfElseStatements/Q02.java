package JAVA_LESSON_TOTURAIL.NestedIfElseStatements;

public class Q02 {
    public static void main(String[] args) {

          /*
                    Type java code by using nested if() statement.
            Write a program to check if a year is leap year or not.
            If the year is divisible by 100 then it must be divisible by 400.
            If a year is not divisible by 100 then it must be divisible by 4.
         */
        int   year=100;
        if (year%100==0){
            if (year%400==0){
                System.out.println("year is Leap");
            }if (year%100==0){
                if (year%4==0){
                    System.out.println("Not Leap Year");
                }else{
                    System.out.println("not valid Year");
                }

            }
        }
    }
}
