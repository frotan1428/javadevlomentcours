package Lamda_Funcational_prgraming;

import java.util.ArrayList;
import java.util.List;

public class Fp07 {
    //POJO  ==>  Plain Old Java Object

    //Variables
    // getter and setter
    // Constructor
    // toString

    public static void main(String[] args) {

//        Courses courses=new Courses("EnglishNT","Java",96,40);
//        System.out.println(courses.toString());

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(AverageScoreGreaterThanGivenNumber(coursesList,90));

    }
    //1)Create a method to check if all average scores are greater than given number
    public static boolean AverageScoreGreaterThanGivenNumber( List<Courses> coursesList,double num){
       return coursesList.stream().allMatch(t-> t.getAverageScore()> num);




    }





}
