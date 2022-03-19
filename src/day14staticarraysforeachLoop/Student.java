package day14staticarraysforeachLoop;

public class Student {

    String name;
    int year=2022;
    static int counter=1000;
    String studentID;


    public  String setStudentID(){
        counter++;
        studentID= year+ " " +counter;
        return studentID;//if the return type of method is different from "Void" you have to use "return";
    }

}
