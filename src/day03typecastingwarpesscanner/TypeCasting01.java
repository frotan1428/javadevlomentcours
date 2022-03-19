package day03typecastingwarpesscanner;


public class TypeCasting01 {

    public static void main(String[] args) {
        //byte < short < int < long < float < double :primitive data type
        //typecasting converting small datatype to large datatype or large datatype to small datatype.
        // how to convert small data type to large data type: Auto widening
        byte b = 17;// is in byte data type.
        int i=b;     // 17 is datatype

        System.out.println(i);


        // how to convert large  data type to small data type:Explicit Narrowing

        double d=1.3;
        short s=(short)d;

        System.out.println(s);

        // convert short to 257  to byte
        short r = 257;
        byte x=(byte)r;
        System.out.println(x); //1
    }

}
