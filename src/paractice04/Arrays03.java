package paractice04;

public class Arrays03 {

    public static void main(String[] args) {
        String date = "23/02/2022";

        /*
        Please split the dates and get day, month and the year separately on the console
         */

        //day
        //month
        //year

        String  [] dates = date.split("/");

        for(String each: dates){
            System.out.println(each);
        }

        //2. way

//        System.out.println("day: "+date.split("/")[0]);
//        System.out.println("Month: "+date.split("/")[1]);
//        System.out.println("Year: "+date.split("/")[2]);

        System.out.println("Day: "+dates[0]);
        System.out.println("Month: "+dates[1]);
        System.out.println("Year: "+dates[2]);


    }
}
