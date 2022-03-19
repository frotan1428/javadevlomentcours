package JAVA_LESSON_TOTURAIL.NestedIfElseStatements;

public class Q01 {
    public static void main(String[] args) {

             /*

                        Type java code by using nested if statement,
                If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
                “Perfect even number” otherwise, the output will be “Good even number.”
                If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
                “Perfect odd number” otherwise, the output will be “Good odd number.”
               */
        int n=4;
        if (n%3!=0){
            System.out.println("Perfect even Number");
        }else if(n%3!=0){
            System.out.println("Good even Number");

        }else if (n%3==0){
            System.out.println("Perfect odd number");
        }else{
            System.out.println("Good odd number.");
        }
    }
}
