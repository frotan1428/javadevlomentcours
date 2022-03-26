package day31Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMaps02 {
    public static void main(String[] args) {

        /*
        Create a HashMap and give key value pairs as following;
        Math = 8
        Java = 9
        SDLC = 9
        Api  = 7


         */

        HashMap<String,Integer> hm1=new HashMap<>();
        hm1.put("Math",8);
        hm1.put("Java",9);
        hm1.put("SDLC",9);
        hm1.put("API",7);

        Set<String> set=hm1.keySet();
        for (String w:set){
            System.out.println(w);
        }

        Collection<Integer> values=hm1.values();
        for (Integer x:values){
            System.out.println(x);
        }

        Set<Map.Entry<String, Integer>> SetForm=hm1.entrySet();
        for (Map.Entry<String,Integer> w:SetForm){
                if (w.getKey().equalsIgnoreCase("Java"))
                 System.out.println("This java Key: "+w.getValue());
        }
        Set<Map.Entry<String, Integer>> SetForm2=hm1.entrySet();
        for (Map.Entry<String,Integer> w:SetForm2){
            if (w.getValue()>8){
                System.out.println(" Value Greater  than : "+w.getKey());
            }
        }
        /*
         when we use Maps we can use  just print  them on the console as a map
          when we use Maps we can  KeySet() the have Only keys of maps
          when we use Maps we can  getValue() the have Only Valued of maps
          when we want to get Specific value from maps we use get().
          when we want to get All keys And  value from maps we EntrySet().

         */
        System.out.println("all keys:  "+hm1.keySet());//all keys:  [Java, API, Math, SDLC] return Set
        System.out.println("All Values:  "+hm1.values());//All Values:  [9, 7, 8, 9] // Return Collections
        System.out.println("Gets Specific value"+ hm1.get("Java"));//Gets Specific value:9 //String
        System.out.println("All keys And Values: "+ hm1.entrySet());//All keys And Values: [Java=9, API=7, Math=8, SDLC=9] value:9 Set<Map.Entry<k,v>



         int value= hm1.replace("SDLC",10);
        System.out.println("Older Value "+value);
        System.out.println( hm1.replace("SDLC",10,12));

        // This Method will take the key and values it will be Check 2 Conditions  are ture
        // Then it will replace the value otherwise ,it wil not make Changes.
        boolean isTrue=hm1.replace("API",7,8);
        System.out.println(isTrue);//true
        System.out.println(hm1.values());//[9, 7, 8, 10]

        // How tu Remove Elements From Maps.

        hm1.remove("SDLC");
        System.out.println(hm1);//{Java=9, API=8, Math=8}

        // How tu Remove Elements Keys Values Pair from  Maps.
        hm1.remove("Java",9);
        System.out.println(hm1);//{API=8, Math=8}






    }
}
