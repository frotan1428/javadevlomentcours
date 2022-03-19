package JAVA_LESSON_TOTURAIL.StringManipulation;

public class LowerCase01 {

    public static void main(String[] args) {


        String str = "Cat, caterpillar";

        System.out.println(str);
        String str2 = str.toLowerCase();
        String str3 = str.substring(4).toLowerCase();
        System.out.println(str2);
        System.out.println(str3);
    }
}
