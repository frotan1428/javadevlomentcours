package JAVA_LESSON_TOTURAIL.StringManipulation;

public class LastIndexOf01 {
    public static void main(String[] args) {

        String str = "Cat, caterpillar";
        int idx1 = str.lastIndexOf("t");
        int idx2 = str.lastIndexOf("e");
        System.out.println(idx1);
        System.out.println(idx2);
    }
}
