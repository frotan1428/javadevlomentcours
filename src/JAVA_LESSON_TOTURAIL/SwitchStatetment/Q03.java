package JAVA_LESSON_TOTURAIL.SwitchStatetment;

public class Q03 {

    public static void main(String[] args) {
        /*
            If the user pressed 1, 2, 3 the program will print the number that is pressed;
                 otherwise, program will print "Not allowed".
         */
        int num=2;
        switch (num){
            case 1:
                System.out.println("pressed");
                break;
            case 2:
                System.out.println("pressed");
                break;
            case 3:
                System.out.println("pressed");
                break;

            default:
                System.out.println("not allowed");
        }
    }
}
