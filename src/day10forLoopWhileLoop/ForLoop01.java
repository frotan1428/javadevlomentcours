package day10forLoopWhileLoop;

import java.util.Scanner;

public class ForLoop01 {

    //1.example type code to find the sum of integer from 12 to 231

    public static void main(String[] args) {
        int total=0;

        for (int i=12;i<231;i+=1){
            total+=i;
          //  System.out.print(i+ " ");

        }

        System.out.println(total);


        //2.example type code to find the Multiplication of integer from 3 to 5
        int Prodcut=1;

        for (int i=3;i<5;i+=1){
            Prodcut*=i;

        }

        System.out.println(Prodcut);
        //3)Type code to check if a given String is Palindrome.
        //  String: anna  Reversed String: anna

        String s="way";
        String reversedS="";
        for (int i=s.length()-1;i>-1;i--){
            reversedS=reversedS+s.charAt(i);
        }
        System.out.println(reversedS);
        if (s.equals(reversedS)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
        //4)Type code to check if a given integer is Palindrome.
        //  Integer: 12321  Reversed Integer: 12321
        int num=12321;
        String reversedNumber="";
        String stringFromNum=String.valueOf(num);

        for (int i=stringFromNum.length()-1;i>-1;i--){
            reversedNumber=reversedNumber+stringFromNum.charAt(i);
        }

        if (s.equals(reversedNumber)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }


        //5.example: type code to find the sum of digit of an integer;
        int n=222;
        int sumOfDigit=0;
        for (int i=n;i>0;i=i/10){

            sumOfDigit=sumOfDigit+i%10;
        }
        System.out.println(sumOfDigit);

        //6.Example: Type code to find the sum of the unique digits of an integer.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int p = scan.nextInt();
        String pS = String.valueOf(p);
        int sumOfUniqueDigits = 0;

        for(int i=0; i<pS.length(); i++){
           char c = pS.charAt(i);
          //  String c= pS.substring(i,i+1);;

            if(pS.indexOf(c)==pS.lastIndexOf(c)){
                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c + "");//If you put char inside the valueOf() you will get ASCII value
            }
        }
        System.out.println(sumOfUniqueDigits);

    }
}
