package JAVA_LESSON_TOTURAIL.Constructors;

public class Students01 {

    String name;
    String lastName;
    int id;

    public static void main(String[] args) {
        Students01 st1=new Students01("HAFASA","MUSLEH",1428);
        Students01 st2=new Students01("Mohammad","Frotan",1429);

        System.out.println(st1.name+" "+st1.lastName+":"+st1.id);
        System.out.println("----------------------");
        System.out.println(st2.name+" "+st2.lastName+":"+st2.id);


    }
     public Students01 (String name,String lastName,int id){
        this.name=name;
        this.lastName=lastName;
        this.id=id;


    }
}
