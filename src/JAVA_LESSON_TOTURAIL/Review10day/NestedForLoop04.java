package JAVA_LESSON_TOTURAIL.Review10day;

public class NestedForLoop04 {

    public static void main(String[] args) {

         /*
            6.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */

        int row=6;
        for (int i=1;i<row+1; i++){
            for (int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
