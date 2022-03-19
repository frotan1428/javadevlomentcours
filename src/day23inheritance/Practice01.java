package day23inheritance;

public class Practice01 {
    int a = 12;
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        this();//By using 'this()' you can do constructor call from inside the class
        //'this()' must be first statement in constructor body
        //You can use just one this constructor call in a constructor body
        System.out.println("B");
    }
}
class Practice02 extends Practice01{
    int a = 13;
    public Practice02(){
        super(12);
        System.out.println("C");
    }
    public Practice02(int i){
        super(11); //'super()' must be first statement in constructor body
        //You can use just one super constructor call in a constructor body
        System.out.println("E");
    }
}
class Practice03 extends Practice02{
    int a = 14;// if tou make  any variables  private it can not inherit
    // public ,protect class member can be inherited without issue
    // default class member can be inherited with same  package
    public Practice03(String s){
        super(11);
        System.out.println("D");
    }
}
class Runner{
    public static void main(String[] args) {
        Practice03 obj1 = new Practice03("Woow!");
        System.out.println(obj1.a);// java select the by looking the data type of the object
        Practice02 obj2 = new Practice03("Woow!");
        System.out.println(obj2.a);// if a class doesn't have a java looks for parents if parent doesn't have a give compile time error
        Practice01 obj3 = new Practice03("Woow!");
        System.out.println(obj3.a);
        Object obj4 = new Practice03("Woow!");
    }
}
