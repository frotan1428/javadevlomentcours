package day30Collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*

            Deque==>First in Last out
            Queue==> First in First out
     */

    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();

        dq1.add("A");
        System.out.println(dq1);//[A]
        dq1.addFirst("B");
        System.out.println(dq1);//[B, A]
        dq1.addFirst("C");
        System.out.println(dq1);//[C, B, A]
        dq1.addLast("D");
        System.out.println(dq1);//[C, B, A, D]


    }
}
