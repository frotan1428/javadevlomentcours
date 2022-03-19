package day06nestedifternaryswitch;

public class NestedTernay01 {
    public static void main(String[] args) {
       /*
      Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
        */
        //syntax:     (condition) ?             (Ternary1)             :                                 (Ternary2)
        int year=2005;
       String isSlep = (year%100==0) ? (year%400==0 ?"leap Year" :"not leap year"  )  :   (year%4==0? "leap Year" :"not leap year"  );
        System.out.println(isSlep);
    }
}
