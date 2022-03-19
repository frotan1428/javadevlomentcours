package JAVA_LESSON_TOTURAIL.OverLoadMethod;

public class Q03 {
    public static void main(String[] args) {

        System.out.println(hour(2,60));
    }

    public static int hour(int min,  int sec){
        return min*sec;
    }
}
