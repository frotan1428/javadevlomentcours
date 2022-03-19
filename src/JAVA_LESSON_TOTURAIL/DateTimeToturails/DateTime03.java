package JAVA_LESSON_TOTURAIL.DateTimeToturails;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime03 {

    public static void main(String[] args) {

        LocalDate Date= LocalDate.now();

        LocalTime Time= LocalTime.now();

        // Milliseconds
        System.out.println(Time.getNano());//939000000
        // Month
        System.out.println(Date.getMonth());//MARCH
        // Seconds
        System.out.println(Time.getSecond());//44
        // Minutes
        System.out.println(Time.getMinute());//59
        //hours
        System.out.println(Time.getHour());//9
        // Local date + Local time
        System.out.println(Date+":"+Time);//2022-03-02:10:01:03.349
        System.out.println(LocalTime.of(2,50)+":"+LocalDate.of(2008,12,30));//02:50:2008-12-30




    }
}
