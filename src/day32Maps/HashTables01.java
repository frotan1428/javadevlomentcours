package day32Maps;

import java.util.Hashtable;

public class HashTables01 {

    public static void main(String[] args) {
        /*
            hashTable is A Map
            HashTable is Thread safe and synchronized
            HashTable Does Not Accept any null key or Values
            HashTable Does Not Put Elements in natural Order.
            Hashtable is Slower Then Maps
         */
        Hashtable<String,Integer> ht1=new Hashtable<>();
        ht1.put("Ali",3000);
        ht1.put("Tom",500);
        ht1.put("Alexandra",2000);
        ht1.put("Mark",5000);
        ht1.put("Angelina",2300);
        //ht1.put(null,200);
       // ht1.put(null,null); Cannot Accept.
        // I fwe use Null as A key or Value it will give "NullPointerException"

        System.out.println(ht1);

        System.out.println(ht1.containsKey("Angelina")); // if we have Check the  Key it is return Ture otherwise is False.
        System.out.println(ht1.containsValue(5000));//// if we have Check the  Value it is return Ture otherwise is False.


        Hashtable<String,Integer> ht2=new Hashtable<>();
        ht2.put("Ali",3000);
        ht2.put("Alexandra",2000);
        ht2.put("Angelina",2300);
        ht2.put("Tom",500);
        ht2.put("Mark",5000);

        System.out.println(ht1.equals(ht2));//When we check the elements of 2 maps ,it will not Check the order,but just value,

        System.out.println();

        System.out.println(ht1.size()==0); // this is not Best way to Check your maps has elements or not.
        System.out.println(ht1.isEmpty());// this is  Best way to Check your maps has elements or not.





    }
}
