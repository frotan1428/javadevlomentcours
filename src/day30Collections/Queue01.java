package day30Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        Queue <String> q1=new LinkedList<>();

        q1.add("A");
        System.out.println(q1);//[A]

        System.out.println(q1.offer("B"));// true and elements will be inserted without exceptions.
        System.out.println(q1);//[A, B]

        // add Method will throw Expectations  ,but offer method even when yo u have unlimited data ,it will give you the false result.
            //  //This will be learnt while Lambda instructions
        Queue <String> q2=new PriorityQueue<>();
    }
}
