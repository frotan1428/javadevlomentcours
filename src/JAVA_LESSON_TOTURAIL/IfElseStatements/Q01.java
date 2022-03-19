package JAVA_LESSON_TOTURAIL.IfElseStatements;

public class Q01 {

    public static void main(String[] args) {

        /*
              Type java code by using if-else if() statement,
            If age is less than 13 output will be “Should not work”,
            If age is greater than 65 output will be “Retired”,
            Otherwise; output will be “Should work”
         */
        int age=66;
        if (age<13){
            System.out.println("Should Not Work");
        }else if (age>65){
            System.out.println("Retired");
        }else{
            System.out.println("Should Work");
        }
    }
}
