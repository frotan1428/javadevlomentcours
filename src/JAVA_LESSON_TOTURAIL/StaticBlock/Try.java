package JAVA_LESSON_TOTURAIL.StaticBlock;

public class Try {
  static  int a=11;
    public static void main(String[] args) {
        int b=12;
        System.out.println(b);

    }

    static {
        a=15;
        System.out.println(a);
    }
    static {
        a=13;
        System.out.println(a);
    }
}
