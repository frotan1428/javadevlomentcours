package JAVA_LESSON_TOTURAIL.StringManipulation;

public class UpperCase01 {
    public static void main(String[] args) {



        String str = "Cat, caterpillar";

        System.out.println(str);
        String str1 = str.toUpperCase();
        String str4 = str.substring(3,8).toUpperCase();
        System.out.println(str1);
        System.out.println(str4);

    }
}
