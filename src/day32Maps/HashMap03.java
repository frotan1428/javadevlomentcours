package day32Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap03 {
    public static void main(String[] args) {

        /*
            Create a MAP that will have the following keys and values
            Math = 9
            English = 8
            Biology = 7
            History = 6
            French = 7
            Then print all lessons and their scores that are more than 7
             */

        HashMap<String,Integer> hm1=new HashMap<>();
        hm1.put("Math",9);
        hm1.put("English",8);
        hm1.put("Biology",7);
        hm1.put("History",6);
        hm1.put("French",7);
    // 1.way
        Set<Map.Entry<String, Integer>> SetForm2=hm1.entrySet();
        for (Map.Entry<String,Integer> w:SetForm2){
            if (w.getValue()>7){
                System.out.println(" All lesson greater Than 7 : "+w.getKey()+"  :"+ w.getValue());
            }
        }
        // way:
        Set<String> key=hm1.keySet();
        System.out.println(key.size());

        Collection<Integer> values=hm1.values();
        System.out.println(values.size());

       for (Integer w:values){
           if (w>7){
               System.out.println("value:  "+w);
           }

       }


    }
}
