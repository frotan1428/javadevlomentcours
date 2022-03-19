package day17MultidmentaionalArraysList;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    public static void main(String[] args) {

        //Create 5 an Integer List  and add 5 elements into it.
        List<Integer> al1 = new ArrayList<>();
        al1.add(11);
        al1.add(5);
        al1.add(13);
        al1.add(15);
        al1.add(14);
        System.out.println(al1);

        List<Integer> al2 = new ArrayList<>();//[11, 5, 13, 15, 14]
        al2.add(98);
        al2.add(99);
        al1.addAll(al2);
        System.out.println(al1);//[11, 5, 13, 15, 14, 98, 99]

        al2.addAll(al1);
        System.out.println(al2);//[98, 99, 11, 5, 13, 15, 14, 98, 99]

        List<Integer> al3 = new ArrayList<>();//[11, 5, 13, 15, 14]
        al3.add(111);
        al3.add(222);
        al2.addAll(4,al3);
        System.out.println(al2);//[98, 99, 11, 5, 111, 222, 13, 15, 14, 98, 99]

        al2.removeAll(al1);
        System.out.println(al2);//[111, 222]


       boolean b1= al1.contains(98);
        System.out.println("is 98 exist: "+b1);//is 98 exist: true

        al2.clear();
        System.out.println(al2);//[]

        al1.set(5,990);
        System.out.println(al1);//[11, 5, 13, 15, 14, 999, 99]

        // change the element less than 10 to 777
        //1way.
            for (Integer w:al1){
                if (w<10){
                    al1.set(al1.indexOf(w),777);
                }
            }
        System.out.println(al1);//[11, 777, 13, 15, 14, 999, 99]

        //2 way.

        for (int i=0; i< al1.size();i++){

            if (al1.get(i)<10){
                al1.set(i,777);
            }
        }
        //equals ArrayList

        System.out.println(al1);//[11, 777, 13, 15, 14, 999, 99]
            ArrayList<String> sl1=new ArrayList<>();
            sl1.add("java");
            sl1.add("lamba");
            ArrayList<String> sl2=new ArrayList<>();
            sl2.add("java");
            sl2.add("lamba");

          boolean  r1=sl1.equals(sl2);
          System.out.println(r1);//True


    }
}
