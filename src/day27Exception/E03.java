package day27Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Note1: When you type code, java will give you red underline for some Exceptions.
            That kinds of Exceptions are called "Compile Time Exceptions"(Checked Exceptions)
            1)FileNotFoundExceptions This Exception is thrown if the path is wrong or the file is not exist.
            1) IOException: This Exception handles all issues related with input/output

            Note:"FileNotFoundExceptions" is the Child of "IOException"
            Note: if there is parent-child relationship between Exception class  ,Child Exception class Must before
                  parent Exception class in Multiple catch-block usage.
            Note: To execute a code under every condition ,put the code inside the "Finally-Block"

    Note2: a) try -block cannot used alone.
           b) try-block can be used with single catch-block
           c) try-block can be used with Multiple catch-block
           d) try-block can be used with just Finally-block
           c) try-block can be used with Multiple catch-block and Finally-block

     */
public class E03 {

    public static void main(String[] args) {
        goAndReadThFile();

    }
    public static void goAndReadThFile(){
        try {
            FileInputStream fis=new FileInputStream("src\\day27Exception\\File01.txt");
            int k = 0;

            while( (k=fis.read()) != -1){
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching  out the file or exiting of the file "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Connection with cloud was broken");
        }
    }
}
