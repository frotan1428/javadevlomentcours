package JAVA_LESSON_TOTURAIL.DateTimeToturails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime02 {

    public static void main(String[] args) {


        System.out.println(LocalTime.now());//09:44:20.483
        System.out.println( LocalDate.now());//2022-03-02
        LocalTime now1=LocalTime.now();

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2022-03-02T09:46:20.202
        // Adding 1 year, 1 month, 1 week and 1 day
        System.out.println(now.plusYears(1).plusMonths(1).plusDays(2));//2023-04-04T09:47:25.295

        // Subtracting 1 year, 1 month, 1 week and 1 day

        System.out.println(now.minusYears(1).minusMonths(1).minusWeeks(1).minusDays(1));//2021-01-25T09:50:56.884

        // Adding 1 hour, 1 minute, 1 second and 100
        // nanoseconds
        System.out.println(now1.plusHours(1).plusMinutes(1).plusSeconds(1).plusNanos(100));//10:54:32.434000100
        // Subtracting 1 hour, 1 minute, 1 second and 100
        // nanoseconds
        System.out.println(now1.minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(100));//08:53:46.700999900





    }
}
