package JAVA_LESSON_TOTURAIL.ForLoop;

import java.time.LocalDate;

public class Q01 {
    public static void main(String[] args) {

        LocalDate currentDate=LocalDate.now();

        System.out.println(currentDate.plusDays(3).minusMonths(4).plusYears(2));

    }

    }

