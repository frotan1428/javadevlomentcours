package JAVA_LESSON_TOTURAIL.DateTimeToturails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime04 {

    public static void main(String[] args) {


        LocalDate date=LocalDate.now();
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);//2022-03-02T10:04:35.569
        System.out.println(date);//2022-03-02

        // Creating an object of DateTimeFormatter class
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss a");

        // Creating an object of LocalDateTime class
        // and getting local date and time using now()
        // method
        LocalDateTime now = LocalDateTime.now();

        // Formatting LocalDateTime to string
        String dateTimeString = now.format(formatter);

        // Print and Display
        System.out.println(dateTimeString); //2022-03-02 10:09:26 AM
        System.out.println(LocalDateTime.now().format(formatter));//2022-13-02 10:13:06 AM
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss a")));//2022-13-02 10:13:06 AM


    }
}
