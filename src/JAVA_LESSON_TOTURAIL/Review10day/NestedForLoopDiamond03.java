package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class NestedForLoopDiamond03 {
    public static void main(String[] args) {

        int n,i,j,space=1;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Number");
        n=scan.nextInt();

        space=1;
        for (j=1;j<=n-1;j++){
            for (i=1;i<=space;i++){
                System.out.print(" ");
            }
            space++;
            for (i=1;i<=2*(n-j)-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
