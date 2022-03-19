package JAVA_LESSON_TOTURAIL.Ternary;

public class Q09 {

    public static void main(String[] args) {

        /*


               Find the output for name = “Ali” and name = “Veli”
         */
        String name="ahmad";
        String isName=(name.length() > 3) ? (name.contains("i") ? "Veli" : "No name") : ("Ali");
        System.out.println(isName);
         String isContain=(name.equals("Ali")) ? (name.charAt(0)=='a' ? "Good" : "Bad") : ("The worst");
        System.out.println(isContain);
    }
}
