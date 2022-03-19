package day02Datatpes;

public class DataTypes01 {
    /*
        what is the difference between " primitive " and non-primitive question;
        1)primitive content just values; mon primitive content values and method.
        2)primitive data types use just lowercase and non-primitive is data type uppercase
        3)primitives data types were created by java developer con not make primitive data types
            but non-primitives data types can be created by java  and any developer
        4) non-primitives data types use same  size created in memory  but primitives can use different size area in memory.


     */
    public static void main(String[] args) {
        //primitive data types:boolean,char ,byte,short,int,long,float,double
        // 1)boolean has 2 values which are true and false. a boolean variables just use a bit in memory
        boolean isRetired = true;
        boolean isOld= false;

        //2) char is for just a single character it uses 16 bit(2 byte) in memory.
        char ch='A';
        //3) byte is for a whole number between -128 amd 127; it uses 8 bit(byte) in memory
        // less memory make good performance;
         byte age= 14;
         byte mathGrade = 76;
         //4) short :short is used for whole numbers between -32768 and 32768 it uses 16 bits (2 byte);
        short numberOfStudentsInASchool =2134;
        //5) int :int is for whole number between -2,147,483,648 and -2,147,483,648  it use 32 bit (4 byte); in memory
        int anuualProfite  = 20000000;
        //6) long: long is foe whole number between -9,223,372,06,854,808 nad 9,223,372,06,854,808 64 bit(8 byte) in memory
        //not forget L the end vale in long date type;
        long poulutionOfTheWolrd= 2000000000l;
        //7) flaot: flaot is foe whole number between -9,223,372,06,854,808 nad 9,223,372,06,854,808 32 bit(4 byte) in memory
        //not forget "f" the end vale in long date type;
        //8) double

        //no-primitive data types:strings
        String s="Hafasa";

        System.out.println( s.toUpperCase());//Upercase :HAFASA
        System.out.println(s.toLowerCase());//lowercase :hafasa

    }
}
