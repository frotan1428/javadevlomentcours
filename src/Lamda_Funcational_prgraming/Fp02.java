package Lamda_Funcational_prgraming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
    /*
        In functional Programming we use lambda Expression but When we use Method Reference lambda Expression
        Will Not Recommended
        When We use method Reference we have "Class name:: method name". be Carefully about () no needed.

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
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        getNumbersMoreThanEight(l);
        System.out.println();
        printSquareOfOddElements(l);



    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer> list){
        //list.stream().forEach(t -> System.out.print(t+" "));
        list.stream().forEach(Utils::printInSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(Utils::CheckToBeEven).forEach(Utils::printInSameLineWithSpace);
    }

    //Create a method all the numbers more than 8 on the Console

    public static void getNumbersMoreThanEight(List<Integer> list){
        list.stream().filter(Utils::getMoreThanEight).forEach(Utils::printInSameLineWithSpace);
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)

    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(Utils::CheckToBeOdd).map(Utils::getSquare).forEach(Utils::printInSameLineWithSpace);
    }





}
