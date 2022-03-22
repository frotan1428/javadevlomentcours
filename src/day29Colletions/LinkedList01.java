package day29Colletions;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList <String> linkedList=new LinkedList<>();

        linkedList.add("Ali");
        linkedList.add("Can");
        linkedList.add("Mark");
        linkedList.add("Tom");
    //print ans see all elements on te console
        System.out.println(linkedList);

                // how to print first Elements:
        String FirstElements=linkedList.element(); // return the first elements without removing elements(copy+paste)
        System.out.println(FirstElements);//[Ali, Can, Mark, Tom]

        System.out.println(linkedList.poll());// return the first elements with removing  First elements(Cut+paste)
        System.out.println(linkedList);//[Can, Mark, Tom]

        System.out.println(linkedList.peek());//// return the first elements without removing elements(copy+paste)
        System.out.println(linkedList);//[Can, Mark, Tom]



        LinkedList <String> linkedList1=new LinkedList();

       //  System.out.println(linkedList1.element());// return NoSuchElementException

       // System.out.println(linkedList1.peek());//this return just a null if there is no value.

        System.out.println(linkedList1.poll());//this return just a null if there is no value.


        LinkedList<Integer> linkedList3=new LinkedList();

        linkedList3.add(0,12);// When i want to use order elements I can place the specific my list elements.

        linkedList3.add(1,13);
        linkedList3.add(2,10);
        linkedList3.add(3,11);
        System.out.println(linkedList3);//[12, 13, 10, 11]

        System.out.println(linkedList3.removeFirst());// remove the First elements of my list .
        System.out.println(linkedList3);//[13, 10, 11]

        System.out.println(linkedList3.remove(2)); //Remove Elements By index fom the list .

        System.out.println(linkedList3);//[13, 10]










    }
}
