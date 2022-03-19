package JAVA_LESSON_TOTURAIL.DateTimeToturails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1.getTime());//1646196214248
        System.out.println( LocalDate.now());//2022-03-02
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));//2022-03-02
        System.out.println( LocalDate.now().plusYears(2));//2024-03-02
        System.out.println( LocalDate.now().plusMonths(10));//2023-01-02
        System.out.println( LocalDate.now().plusDays(30));//2022-04-01
        System.out.println( LocalDate.now().plusWeeks(100));//2024-01-31
        System.out.println( LocalDate.now().minusWeeks(150).minusDays(100));//2019-01-07
        System.out.println( LocalDate.now().minusDays(100));//2021-11-22
        System.out.println( LocalDate.now().minusWeeks(100));//2020-04-01
        System.out.println( LocalDate.now().minusMonths(52));//2017-11-02
        System.out.println( LocalDate.now().minusYears(100));//1922-03-02
        System.out.println( LocalDate.now().getDayOfWeek());//WEDNESDAY
        System.out.println( LocalDate.now().getMonthValue());//3
        System.out.println( LocalDate.now().getDayOfYear());//61
        System.out.println( LocalDate.now().getMonth());//

        System.out.println(LocalDateTime.now());//2022-03-02T09:31:13.559
        System.out.println(LocalDateTime.now().getHour());//9
        System.out.println(LocalDateTime.now().getMinute());//32
        System.out.print(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute());//9:33
        System.out.println(LocalTime.now().isAfter(LocalTime.of(3,3,2)));//true
        System.out.println(LocalTime.now().isBefore(LocalTime.of(3,3,2)));//False
        System.out.println(LocalTime.now());//09:38:09.180
        System.out.println(LocalTime.now().getHour());//9
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));//2022-03-02T09:40:20.335+09:00[Asia/Tokyo]


    }
}
