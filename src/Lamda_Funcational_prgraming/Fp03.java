package Lamda_Funcational_prgraming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
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
        getElementsOnSeparateLine(l);
        getElementsOnSeparateLineWithStar(l);
        System.out.println("Cube Elements");
        PrintElementsCubeOfDistinctElements(l);
        getSumOfSquareDistinctElement(l);

        productOfCubesDistinctEvenElements(l);
        getMaxElements(l);
        getMinValuesGreaterThanSeven(l);

        halfOfDistinctElementReverseOrder(l);
    }
    //4)Create a method to print all elements on a separate line.

    public static void getElementsOnSeparateLine(List<Integer> list){
        list.stream().forEach(System.out::println);

    }
    //4)Create a method to print all elements on a separate line with Star.
    public static void getElementsOnSeparateLineWithStar(List<Integer> list){
        list.stream().forEach(Utils::printElementWithStar);

    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.

    public static void PrintElementsCubeOfDistinctElements(List<Integer> list){
        list.stream().distinct().
                filter(Utils::CheckToBeOdd).
                map(Utils::getCube).
                forEach(Utils::printInSameLineWithSpace);

    }
    //5)Create a method to calculate the sum of the squares of distinct even elements

    public static void getSumOfSquareDistinctElement(List<Integer> list){

     Integer sum=   list.stream().distinct().filter(Utils::CheckToBeEven).
                map(Utils::getSquare).
                reduce(0,Math::addExact);
        System.out.println("Sum Square "+ sum);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesDistinctEvenElements(List<Integer> list){
      Integer product=  list.stream().distinct().
                filter(Utils::CheckToBeEven).
                map(Utils::getCube).
                reduce(1,Math::multiplyExact);
        System.out.println(product);

    }

    //7)Create a method to find the maximum value from the list elements

    public static void getMaxElements(List<Integer> list){
      Integer Max= list.stream().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(Max);

    }

    //9)Create a method to find the minimum value which is greater than 7 and even from the list

    public static void getMinValuesGreaterThanSeven(List<Integer> list){
        Integer min= list.stream().distinct().filter(t->t>7).filter(Utils::CheckToBeEven).reduce(Integer.MAX_VALUE,Math::min);

        System.out.println(min);
    }
   // 10)Create a method to find the half of the elements which are distinct
    // and greater than 5 in reverse order in the list.

    public static void halfOfDistinctElementReverseOrder(List<Integer> list){
        List<Double> list1=   list.stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(list1);

    }



}
