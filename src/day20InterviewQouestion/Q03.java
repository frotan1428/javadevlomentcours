package day20InterviewQouestion;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    /*	 	Create a function(Method) that takes an array and
            returns the difference between the biggest and the smallest numbers.
            Ask user to enter array elements.	*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Length of Array");

        int len= scan.nextInt();
        int arr[]=new int[len];
        for (int i=0; i<len; i++){
            arr[i]=scan.nextInt();
        }
         Arrays.sort(arr);
        int difValue=arr[len-1]-arr[0];
        System.out.println(" The Different is biggest and smallest:   "+difValue);
        System.out.println("The Different is biggest and smallest: "+getDifference(arr));
    }
    public  static  int getDifference(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];

    }

}


