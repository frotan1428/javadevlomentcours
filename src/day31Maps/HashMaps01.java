package day31Maps;

import java.util.*;

public class HashMaps01 {

    public static void main(String[] args) {

        /*
          Maps use keys value pairs Structure
          Keys should be unique but Values Can be duplicate
          In maps Keys Can not be Null except HashMaps, In HashMap You can use  only once For keys,
          but you can have Multiple nulls for value.

          HashMap does not Create elements in Natural Order tha is why it is supper faster.
          HashMaps is not thread -safe
          HashMap is not synchronised

          When you use maps ,if we give key, it will return always the value.





         */
        HashMap<Integer,String> hm1=new HashMap<Integer,String>();
        hm1.put(100,"Ali");
        hm1.put(101,"vali");
        hm1.put(102,"Alive");
        hm1.put(103,"Veliye");
        hm1.put(null,"Mary");
        hm1.put(null,"Kemal");
        hm1.put(104,null);
        hm1.put(105,null);

        System.out.println(hm1);//{null=Kemal, 100=Ali, 101=vali, 102=Alive, 103=Veliye, 104=null, 105=null}


        HashMap<Integer,String> hm2=new HashMap<Integer,String>();
        hm2.put(87,"X");
        hm2.put(88,"K");
        hm2.put(89,"L");
        hm1.putAll(hm2);// This will be ignored the order of elements when getting new maps elements
        /*
        When we merge  elements of Maps to another ,we have to use same Daa Type.

         */
        System.out.println(hm1);// {null=Kemal, 100=Ali, 101=vali, 102=Alive, 103=Veliye, 87=X, 104=null, 88=K, 105=null, 89=L}

        hm1.putIfAbsent(107,"Z"); // This is mean if this key does not exist ,then Create with new Value
        System.out.println(hm1);//if the key does not exist ,then it will be created new key value pair.

        String value=hm1.get(102); // if key Exist  to get specif value we use key .then it will give the value
        System.out.println(value);//Alive

        String value2=hm1.get(999); // if key  does not Exist  to get specif value we use key .then it will give the null
        System.out.println(value2); //null
        // if you use getOrDefault, and you have a valid key, the value will be return
        // if you do not have a value key it will return the costume massage
        String value3 =hm1.getOrDefault(103,"There is key like that");
        System.out.println(value3);// veliye

        Set<Integer> Key=hm1.keySet();//This keySet  return a method Set for all keys
        Collection<String> myValue=hm1.values();//This will be   return a method Collection  for all values
        System.out.println(Key);//[null, 100, 101, 102, 103, 87, 104, 88, 105, 89, 107]
        System.out.println(myValue);//[Kemal, Ali, val, Alive, Veli ye, X, null, K, null, L, Z]


        Set<Map.Entry<Integer,String>> SetForm=hm1.entrySet();//print keys and Values.
        System.out.println(SetForm);//[null=Kemal, 100=Ali, 101=vali, 102=Alive, 103=Veliye, 87=X, 104=null, 88=K, 105=null, 89=L, 107=Z]

        for (Map.Entry<Integer,String> each:SetForm){
            System.out.println(each);//this gives a whole key value pairs.
        }

        for (Map.Entry<Integer,String> each:SetForm){

            System.out.println("Keys :"+each.getKey());//this gives a whole key value separately
            System.out.println("Values: "+each.getValue());

        }
        System.out.println(hm1);//{null=Kemal, 100=Ali, 101=vali, 102=Alive, 103=Veliye, 87=X, 104=null, 88=K, 105=null, 89=L, 107=Z}
        //this is the look of maps

        Collection<String> allMyVaules=hm1.values();
        System.out.println(allMyVaules);//[Kemal, Ali, vali, Alive, Veliye, X, null, K, null, L, Z]
        Set<Integer> myAllKeys =hm1.keySet();//this is just gives Keys not Values.
        System.out.println(myAllKeys);//[null, 100, 101, 102, 103, 87, 104, 88, 105, 89, 107]

        Set<Map.Entry<Integer,String>> SetFormMaps=hm1.entrySet();

        for (Map.Entry<Integer,String> W:SetFormMaps){

            System.out.println(W.getKey()+":");//this gives a whole keys
            System.out.println(W.getValue());//this gives a whole Values

        }


        // Interface ={Abstraction ,Inheritance,Polymorphism}



        //








    }
}
