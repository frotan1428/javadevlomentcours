package day14staticarraysforeachLoop;

import java.util.Arrays;

public class Arrays05 {


    // how to Create an array and put in it in one line.
    public static void main(String[] args) {

        int a[]={12,7,0,32};
        System.out.println(Arrays.toString(a));//[12,7,0,32]

        //how to check if two arrays are same or not
        // note: if two arrays have same elements at the same index arrays same.

        int b[]={12,7,0,32};
        System.out.println(Arrays.toString(b));//[12,7,0,32]
        boolean areArraySame= Arrays.equals(a,b);
        System.out.println(areArraySame);

        // type code to check if 2 arrays have same element.

        Arrays.sort(a);//[0,7,12,32]
        Arrays.sort(b);//[0,7,12,1]
        if (Arrays.equals(a,b)){
            System.out.println("Arrays Are Same");
        }else{
            System.out.println("Different arrays");
        }

         //Type code to check if a specific element exists in an array or not
        int c[]={-12,21,0,-2,34};

        int counter=0;// flag is used to test \if a part of code worked or not.
        int num=3;
        for (int w:c){
            if (w==num){
                counter++;
                break;
            }
        }
        if (counter==0){
            System.out.println(num+"Does not Exist");
        }else{
            System.out.println("Exist");
        }
    }
}
