package paractice02;

public class Q08 {


    public static void main(String[] args) {


           /*
                    Get the number of rows from user then draw a right triangle by using asterisk
                    Number of rows = 4 ==>    *
                                              * *
                                              * * *
                                              * * * *
             */

        int numRows=4;
        for (int i=1;i<numRows+1;i++){
            for (int k=1;k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
