package JAVA_LESSON_TOTURAIL;

import java.time.LocalDate;

public class day1903 {


    public static void main(String[] args) {
        LocalDate date=LocalDate.now();

        System.out.println(date.minusMonths(3).plusYears(3).plusDays(3));//change method.
        //HH=13-14 like that 24 format
        //hh=3-4 like that  12 format
    }
}
