package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class CheckSpace {

    public static void main(String[] args) {

        List<Integer> al4 = new ArrayList<>();
        al4.add(3);
        al4.add(5);
        al4.add(7);
        al4.add(9);
        int i2=0;
        int x=0;
        while (i2<al4.size()){
            x= x + al4.get(i2);
            i2++;
        }

        System.out.println(x);

        List<Character> ch = new ArrayList<Character>();

        for (char i='a'; i<='e';i++){
            ch.clear();
            ch.add(i);

        }


        System.out.println(ch);

        int arr[]={2,4,6,8};
        List<Integer> al2 = new ArrayList<>();
        int i=0;
        do {
            al2.add(arr[i]);
            i++;
        }while (i<arr.length);
        System.out.println(al2);


    }
}
