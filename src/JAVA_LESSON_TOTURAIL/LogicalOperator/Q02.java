package JAVA_LESSON_TOTURAIL.LogicalOperator;

public class Q02 {

    public static void main(String[] args) {


        /*
            true  | |  true = true
            true  | |  false = true
            false | |  false = false
            false | |  true = true
             If 0 is false and 1 is true,
        | | operation is similar to addition of 0 and 1
         */

        if ( 4>= 5 || 10 >= 12 ) {
            System.out.println("Apple");
        } else {
            System.out.println("Grape");
        }
        if ( 4 == 4 || 10 == 11 ) {
            System.out.println("Apple");
        } else {
            System.out.println("Grape");
        }
    }
}
