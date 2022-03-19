package day14staticarraysforeachLoop;

public class StudentRunner {

    public static void main(String[] args) {
        // To access static class members "class name" is enough to access
        System.out.println(Student.counter);


        // to create non-static class member you have to create an object
        Student std1=new Student();
        System.out.println(std1.setStudentID());


    }
}
