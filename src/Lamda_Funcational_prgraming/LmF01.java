package Lamda_Funcational_prgraming;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LmF01 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(330);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        getMaxElements01(l);
        getMaxElements02(l);
        getMinimumGreaterThan7(l);
        getMinimumGreaterThan702(l);
        getMinimumGreaterThan703(l);
        halfOfDistinctElementReverseOrder(l);
        SumOfSquare(l);
        ProductOfCubeOfDistinctElements(l);

    }
    //7)Create a method to find the maximum value from the list elements
    // 1way
    public static void getMaxElements01(List<Integer> list){
      Integer Max=  list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t:u);
        System.out.println(Max);
    }
    //2 way
    public static void getMaxElements02(List<Integer> list){
        Integer Max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(Max);
    }
    ///Homework	//8)Create a method to find the minimum value from the list elements(In 2 ways)


    //9)Create a method to find the minimum value which is greater than 7 and even from the list

    //more than 7,even,minimum:

    public static void getMinimumGreaterThan7(List<Integer> list){
        //1 way
       Integer Min7=list.stream().
               distinct().
               filter(t-> t>7).
               filter(t->t%2==0).
               reduce(Integer.MAX_VALUE,(t,u)-> t>u ? u:t);
       System.out.println(Min7);
    }

    public static void getMinimumGreaterThan702(List<Integer> list){
        //2 way
       Integer Min7= list.stream().
               distinct().
               filter(t->t>7).
               filter(t-> t %2 ==0).
               sorted(Comparator.reverseOrder()).
               reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(Min7);

    }
    //3 way
    public static void getMinimumGreaterThan703(List<Integer> list){
        //2 way
        Integer Min7= list.stream().
                distinct().
                filter(t->t>7).
                filter(t-> t%2==0).
                sorted().
                findFirst().
                get();

        System.out.println(Min7);
    }
    //10)Create a method to find the half of the elements which are distinct
    // and greater than 5 in reverse order in the list.
    //Conditions: half of elements,greater than 5, reverse order ,list

    public static void halfOfDistinctElementReverseOrder(List<Integer> list){
    List<Double> list1=   list.stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(list1);

    }
//5)Create a method to calculate the sum of the squares of distinct even elements

    public static void SumOfSquare(List<Integer> list){

       Integer sum= list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0,(t,u) -> t+u);
        System.out.println(sum);

    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void ProductOfCubeOfDistinctElements(List<Integer> list){
       Integer Product= list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t,u)-> t*u);
        System.out.println(Product);
    }

}
