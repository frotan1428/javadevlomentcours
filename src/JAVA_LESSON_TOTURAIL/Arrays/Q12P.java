package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q12P {

    public static void main(String[] args) {

        String color[]={"Green","White","Yellow","Pink","Purple","Blue","Blue","Black"};

          System.out.println(Arrays.toString(color));
          Arrays.sort(color,Comparator.comparingInt(String::length));
          System.out.println("According to length " +Arrays.toString(color));


        Arrays.sort(color,Comparator.comparingInt(String::length).reversed());
        System.out.println("descending   to length " +Arrays.toString(color));

        Arrays.sort(color, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println("descending  according to alphabetical to length " +Arrays.toString(color));


    }
}
