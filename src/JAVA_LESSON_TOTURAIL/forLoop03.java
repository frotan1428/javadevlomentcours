package JAVA_LESSON_TOTURAIL;

public class forLoop03 {

    public static void main(String[] args) {
        //2: Type all integers from 11 to 44 in the same line with a space between consecutive integers
        for (int i=11; i<44; i+=1){    // Increment
            System.out.print(i+" ");
        }
        System.out.println("========");
        for (int i=44; i>11; i-=1){    // Increment
            System.out.print(i+" ");
        }


    }
}
