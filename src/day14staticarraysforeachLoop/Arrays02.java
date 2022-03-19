package day14staticarraysforeachLoop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

     //Create a String array and print the elements in alphabetical order on  the console in different lines
        // 1.Create a String array
        System.out.println("====Q1=======");
        String myString[]=new String[4];// [null,null,null,null]
        System.out.println(Arrays.toString(myString));

        // add Element int array
        myString[0]="veli";
        myString[1]="Can";
        myString[2]="beyhan";
        myString[3]="Ali";
        System.out.println("=====Q2======");
        System.out.println(Arrays.toString(myString));
        // how to put Element in alphabetical order
        System.out.println("=====Q3======");
        Arrays.sort(myString);
       System.out.println(Arrays.toString(myString));

        // how to print the element in different lines.
        for (String W:myString){
            System.out.println(W);
        }
        System.out.println("====Q4=======");
        //print the list element if the number of Character is less than 4
       for (String W:myString){
           if(W.length()<4){
               System.out.println(W);
           }
       }
        System.out.println("====Q5=======");
        // print the List element if you Print "Can" stop printing.
        for (String W:myString){
            System.out.println(W);
            if (W.equals("Can")){
                break;
            }
        }
        System.out.println("====Q6=======");
        // print the List element if you before "Can" stop printing.
        for (String W:myString){

            if (W.equals("Can")){
                break;
            }
            System.out.println(W);
        }
        System.out.println("====Q7=======");
        // print the List except "Can" stop printing.
        //1.way
        for (String W:myString){
         if (!W.equals("Can")){
             System.out.println(W);
         }
        }
        System.out.println("====Q8=======");
        // 2.way
        for (String W:myString){
            if (W.equals("Can")){
                continue;// continue to expect the specific element or Skips element/s under some conditions
            }
            System.out.println(W);
        }


    }
}
