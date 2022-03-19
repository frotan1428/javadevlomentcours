package JAVA_LESSON_TOTURAIL.SwitchStatetment;

public class Q01 {

    public static void main(String[] args) {

        String gender="male";
        switch (gender){
            case "Female":
                System.out.println("this is a boy");
                break;
            case "male":
                System.out.println("this is a girls");
                break;
            default:
                System.out.println("No Boy and Girls");
        }
    }


}
