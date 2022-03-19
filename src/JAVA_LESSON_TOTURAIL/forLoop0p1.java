package JAVA_LESSON_TOTURAIL;



import java.util.Scanner;

public class forLoop0p1 {

    public static void main(String[] args) {
        //example; REVERSE ;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine();
             for (int i=s.length()-1;i>=0;i--){
               System.out.print(s.charAt(i));


            }

    }
}
