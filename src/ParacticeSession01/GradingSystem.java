package ParacticeSession01;

import java.util.Scanner;

public class GradingSystem {

    /*
           Grading System:
            There are total 5 subjects of a student
            Take the marks from as an input for the 5 subjects
            Make sure that each subject have marks out of 100
            Calculate the total marks obtained by the student
            Then calculate the Average of Marks
            Finally calculate the grade of the student according to the following criteria.
            If student got average between 80 and 100, then he/she get the Grade A
            If student got average between 70 and 80, then he/she get the Grade B
            If student got average between 60 and 70, then he/she get the Grade C
            If student got average between 50 and 60, then he/she get the Grade D
            If student got the average below the 50 marks, then he/she will consider fail
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Students Name:");
        String name=scan.nextLine();
        System.out.println("Please Enter the marks of 5 Subjects");
        System.out.println("English Subject marks:");
        int eng=scan.nextInt();
        System.out.println("Math Subject marks:");
        int math=scan.nextInt();
        System.out.println("science Subject marks:");
        int sci=scan.nextInt();
        System.out.println("physics Subject marks:");
        int phy=scan.nextInt();
        System.out.println("chemistry Subject marks:");
        int che=scan.nextInt();

        int total=eng+math+sci+che+phy;
        int avg=total/5;
        System.out.println("The Total marks "+total);

        //now I AM GOING TO CALCULATE THE AVERAGE
        if(avg >=80 && avg<=100){
            System.out.println("Hello "+name);
            System.out.println("You have A Grade");
        }else if(avg >=70 && avg<80){
            System.out.println("Hello "+name);
            System.out.println("You have B Grade");
        }else if(avg >=60 && avg<69){
            System.out.println("Hello "+name);
            System.out.println("You have C Grade");
        }else if(avg >=50 && avg<59){
            System.out.println("Hello "+name);
            System.out.println("You have D Grade");
        }else if(avg < 50){
            System.out.println("Hello "+name);
            System.out.println("You have F Grade");
        }

    }
}
