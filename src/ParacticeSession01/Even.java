package ParacticeSession01;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check its EVEN or ODD:");
        int num=scan.nextInt();
      if (num%2!=0){
          System.out.println(num+ " is  odd number");
      }else{
          System.out.println(num+ " This is Even Number");
      }

    }
}
