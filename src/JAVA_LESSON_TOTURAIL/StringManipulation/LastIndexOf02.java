package JAVA_LESSON_TOTURAIL.StringManipulation;

public class LastIndexOf02 {
    public static void main(String[] args) {

        String str = "Cat,caterpillar";
        int idx7 = str.lastIndexOf("a" , 2 );
        int idx8 = str.lastIndexOf("at" , 6 );

        System.out.println(idx7);
        System.out.println(idx8);
    }
}
