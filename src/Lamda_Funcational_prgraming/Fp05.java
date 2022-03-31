package Lamda_Funcational_prgraming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp05 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("lberto");
        l.add("Tucker");
        l.add("Benjamin");
        printInUpperCase(l);
        System.out.println();
        //printInUpperCase01(l);
        PrintTheElementsOrderBaseLength(l);
        System.out.println();
        PrintTheElementsOrderBaseLength01(l);
        System.out.println();
        PrintDistinctElementsSortedByLastChar(l);

        System.out.println();
        PrintAllElementsByTheirLengthAndFirstChar(l);
        System.out.println();
       // RemoveTheElementsTheLengthGreaterThanFive(l);
        RemoveElementsLengthInBetween8And10AndEndsWithO(l);
        System.out.println();
        RemoveElementsLengthInBetween8And10AndStartWithA(l);
        System.out.println( CheckTheElementsLengthToBeLessThan12(l));
        System.out.println(CheckTheElementsNotInitialWithX(l));

        System.out.println(CheckAtLeastAnyMatch(l));


    }
    //1) Create a method to print all list elements in uppercase int same line with a space
    //1way:
    public static void printInUpperCase(List<String> list){
       list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);
    }
    // 2way:

   /*
    public static void printInUpperCase01(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */

   // Create a method to print the elements after ordering according to their lengths

    public static void PrintTheElementsOrderBaseLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);

    }
    // Create a method to print the elements after ordering according to their lengths (In reverse order)

    public static void PrintTheElementsOrderBaseLength01(List<String> list){
       list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);

    }
    //4) Create a method to sort the distinct elements by using their last characters
    public static void PrintDistinctElementsSortedByLastChar(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInSameLineWithSpace);
    }


    //5) Create a method to sort the elements according to their lengths then according to their first character

    public static void PrintAllElementsByTheirLengthAndFirstChar(List<String> list){
        list.stream().
                sorted(Comparator.comparing(String::length).
                thenComparing(t-> t.charAt(0))).
                forEach(Utils::printInSameLineWithSpace);
    }
    //6) Remove the elements if the length of the element is greater than 5

//    public static void RemoveTheElementsTheLengthGreaterThanFive(List<String> list){
//        list.removeIf(t-> t.length() >5);
//        System.out.println(list);
//
//    }
    //8) Remove the elements if the length is between 8 and 10 or ending with 'o'

    public static void RemoveElementsLengthInBetween8And10AndEndsWithO(List<String > list){
        list.removeIf(t-> t.length() >7 && t.length() < 11 || t.endsWith("o"));
        System.out.println(list);


    }

    //8) Remove the elements if the length is between 5 and 8 or ending with 'o'

    public static void RemoveElementsLengthInBetween8And10AndStartWithA(List<String > list){
//        list.removeIf(t-> t.length() >4 && t.length() < 9 || t.startsWith("A"));
//        System.out.println(list);
        Predicate<String > checkCondition = t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o");
        list.removeIf(t -> checkCondition.test(t));
        System.out.println(list);


    }
   // /9) Create a method to check if the lengths of all elements are less than 12

    public static boolean CheckTheElementsLengthToBeLessThan12(List<String> list){
      return   list.stream().allMatch(t-> t.length() <12);
      //this method Check all the values
    }

    //10) Create a method to check if the initial of any element is not ‘X’
   public static boolean CheckTheElementsNotInitialWithX(List<String> list){
         return  list.stream().noneMatch(t-> t.startsWith("X"));
   }

   //11) Create a method to check if at least one of the elements ending with “r”
    public static boolean CheckAtLeastAnyMatch(List<String> list){
       return list.stream().anyMatch(t-> t.endsWith("r"));

    }


}
