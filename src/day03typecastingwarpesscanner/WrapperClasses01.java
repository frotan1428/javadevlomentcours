package day03typecastingwarpesscanner;

public class WrapperClasses01 {
    public static void main(String[] args) {

        /*

        non-primitive is better than primitive
        wrapper class  int------Integer wrapper class are non-primitive data type put to heap Memory
        1) java created a new structure by putting some method into primitive data type that structure is called WC.
        2) boolean==>Boolean
           char===>Character
           byte=====>Byte
           short====>Short
           int======>Short
           long=====>Long
           float======>Float
           double=======Double
         3)Wrapper Classes non-primitive ,and store to Heap memory

         */

        //how to convert primitive data type to Wrapper Classes:AutoBoxing

        char ch='b';
        Character WC=ch;
        int i=12;
        Integer Wi=i;
        float f= 1.3f;
        Float Wf=f;
        //how to convertWrapper Classes data type to  primitive Data type:unboxing
        Short s = 23;
        short sh= s;
        //Find the min and max of byte data type
        System.out.println(Byte.MIN_VALUE);//-127
        System.out.println(Byte.MAX_VALUE);//127
        // find the sum of max  vale and short and min value of long
        System.out.println(Short.MAX_VALUE+Long.MIN_VALUE);





    }
}
