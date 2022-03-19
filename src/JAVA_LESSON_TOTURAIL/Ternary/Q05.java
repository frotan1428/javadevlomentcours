package JAVA_LESSON_TOTURAIL.Ternary;

public class Q05 {
    public static void main(String[] args) {

        int y = 12;
        int z = 11;
        int result = y<10 ? y++ : z++;
        System.out.println(result + "," + y + "," + z);
    }
}
