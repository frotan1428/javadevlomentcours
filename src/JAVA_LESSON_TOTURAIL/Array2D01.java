package JAVA_LESSON_TOTURAIL;

public class Array2D01 {

    public static void main(String[] args) {
         int arr[][]={{1,2},{3},{4,5,6}};

         for (int[] w:arr){
             for (int z:w){
                 System.out.print(z+" ");
             }
         }
    }
}
