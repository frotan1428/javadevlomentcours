package JAVA_LESSON_TOTURAIL.Constructors;

public class student02 {

    String name;
    String lastName;
    int id;

    public static void main(String[] args) {
        student02 st2=new student02();
        student02 st1=new student02("Haffasa","Musleh",1428);
        System.out.println(st1.name+","+st1.lastName);
    }

    student02(){

    }
    public student02(String name,String lastName,int id){
        this.name=name;
        this.lastName=lastName;
        this.id=id;


    }
}
