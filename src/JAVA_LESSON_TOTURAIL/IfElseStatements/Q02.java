package JAVA_LESSON_TOTURAIL.IfElseStatements;

public class Q02 {
    public static void main(String[] args) {
        /*

                    Type java code by using if-else if() statement.
            A school has the following rules for grading system:
            1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
         */
      int grade=78;
      if(grade>=80 && grade>=90){
          System.out.println("A");
      }else if(grade<=60 && grade<=80){
          System.out.println("B");
      }else if(grade<=59 && grade<=50){
          System.out.println("C");
      }else if(grade<50){
          System.out.println("D");
      }

    }
}
