package JAVA_LESSON_TOTURAIL.SwitchStatetment;

public class Q04 {


    public static void main(String[] args) {

        /*

        Write a Java program user will choose answer among A, B, C, or D.
        If the answer is true, output will be “True.” If the answer is false, output will be
            “False”. Correct answer is ‘C’ for the multiple option question.
         */
        String Choose="D";
        switch (Choose){
            case "A":
                System.out.println("False");
                break;
            case "B":

                System.out.println("True");
                break;
            case "C":
                System.out.println("correct answer");
                break;
            case "D":
                System.out.println("True");
                break;
            default:
                System.out.println("invalid ");
        }
    }
}
