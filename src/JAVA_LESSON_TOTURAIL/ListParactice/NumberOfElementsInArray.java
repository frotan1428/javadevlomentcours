package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;

public class NumberOfElementsInArray {
    //How to get the number of elements in an ArrayList
    public static void main(String[] args) {

        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(12);
        al1.add(10);
        al1.add(15);
            //1.way
        System.out.println(al1.size());//3
        //2.way
        int NumberOfElementsInArray=al1.size();
        System.out.println(NumberOfElementsInArray);//3

      //  How to check if an ArrayList is empty or not


        //1.way
        if (al1.size()==0){
            System.out.println("This is  Empty");
        }else{
            System.out.println("Ths is not empty");
        }
            //2.way
        if (al1.isEmpty()){
            System.out.println("This is  Empty");
        }else{
            System.out.println("Ths is not empty");
        }




    }
}
