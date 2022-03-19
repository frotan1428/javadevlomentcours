package JAVA_LESSON_TOTURAIL;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day1904 {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();

        DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(dft);
    }
}
