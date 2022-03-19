package JAVA_LESSON_TOTURAIL;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class day1901 {

    public static void main(String[] args) {

        LocalDate date=LocalDate.now();

        System.out.println(date.plusMonths(2));


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dtr=DateTimeFormatter.ofPattern("HH/mm");//if you use 4 mmm is full name month and 3 mm is 3 character.


        System.out.println(dtf);



    }
}
