package JAVA_LESSON_TOTURAIL.DoWhileLoop;

public class Q02 {
    public static void main(String[] args) {

        //print sum of number from 1-10 using Do while loop
        int i=1;
        int sum=0;
        do {
            i++;
            sum=sum+i;
        }while (i<11);
        System.out.println(sum);
    }
}
