package JAVA_LESSON_TOTURAIL.StringManipulation;

public class IndexOf01 {

    public static void main(String[] args) {

        String str = "Cat, caterpillar";
        // with on parameter;
        /*

         /*
        int idx1 = str.indexOf("C");
        int idx2 = str.indexOf("r");
        System.out.println(idx1);
        System.out.println(idx2);

         */

        // with tow parameter;
        int idx1 = str.indexOf("a",2);
        int idx2 = str.indexOf("at",1);
        System.out.println(idx1);

    }
}
