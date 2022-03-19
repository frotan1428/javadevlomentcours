package day06nestedifternaryswitch;

public class NestedTernary02 {

    public static void main(String[] args) {

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it has no more than 8 characters initial should be 'K'
        Solve the task by using nested-ternary
     */

        //length() method returns the number of characters in a String

            String pwd="Kaby3f5";

       String isValid= (pwd.length()>8) ?(pwd.charAt(0)=='i' ? "valid password" :"Not Valid") :( pwd.charAt(0)=='K' ?"valid password" :"Not Valid");

        System.out.println(isValid);

    }
}
