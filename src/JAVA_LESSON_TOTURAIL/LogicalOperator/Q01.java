package JAVA_LESSON_TOTURAIL.LogicalOperator;

public class Q01 {
    public static void main(String[] args) {
        /*
                true  && true==>true    1*1=1
                False && True==>False   0*1=0
                True  && False==>False  1*1=0
                False && False==>False  0*0=0
         */

        if ( 4<= 4 && 10 <= 10 ) {
            System.out.println("Apple");
        } else {
            System.out.println("Grape");
        }
        if ( 4 == 4 && 10 == 11 ) {
            System.out.println("Apple");
        } else {
            System.out.println("Grape");
        }

    }
}
