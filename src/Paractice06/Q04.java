package Paractice06;

public class Q04 {

    public static void main(String[] args) {
        int total=0;

        StringBuilder letter= new StringBuilder("abcdefg");
        total+=letter.substring(1,2).length();
        total+=letter.substring(6,6).length();
        total+=letter.substring(6,5).length();//error
        System.out.println(total);

           /*
                    A. 1
                    B. 2
                    C. 3
                    D. 7
                    ==>E. An exception is thrown.
         */


    }


}
