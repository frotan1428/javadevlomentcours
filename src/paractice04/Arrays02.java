package paractice04;

import java.util.Arrays;

public class Arrays02 {


        public static void main(String[] args) {

            //0   1   2   3    4
            int [] arr = {34, 54, 12, 37, 29};//5 values

            int expectedElement = 12;

            int counter = 0;

            for(int i=0; i < arr.length; i++){

                if(arr[i] == expectedElement){
                    counter++;
                    break;
                }


            }
            if(counter > 0){
                System.out.println("Array contains expected value");
            }else{
                System.out.println("Array does not contain expected value");
            }


//        Arrays.sort(arr);

            System.out.println("Binary search result: "+ Arrays.binarySearch(arr, expectedElement));//We will get the value index number


        }



    }

