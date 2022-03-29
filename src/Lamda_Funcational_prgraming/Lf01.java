package Lamda_Funcational_prgraming;

import java.util.ArrayList;
import java.util.List;

public class Lf01 {
    /*
      lambda is a functional programming ,we have had lambda in java with version 8
      Functional programming focuses on"what to do" with structure programming we focus on "how to do"

     */
    public static void main(String[] args) {


        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElementsStructure(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEventElementsStructured(l);
        System.out.println();
        printEventElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeDistinctOfElements(l);


    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)

    public static void printElementsStructure(List<Integer> list){
       for (Integer w:list){
           System.out.print(w+" ");
       }
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer> list){
       list.stream().forEach(t -> System.out.print(t+" "));
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printEventElementsStructured(List<Integer> list){
        for (Integer w:list){
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }

    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)

    public static void printEventElementsFunctional(List<Integer> list){
       list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+ " "));
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+ " "));

    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    // elements should be distinct (unique)
    //elements should be odd
    //elements should as cube

    public static void printCubeDistinctOfElements(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+ " "));
    }

    //7)Create a method to find the maximum value from the list elements



}
