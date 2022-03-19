package JAVA_LESSON_TOTURAIL.Review10day;

public class NestedForLoop02 {
    public static void main(String[] args) {

        /*
             Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
         */
        for (int i=1;i<4;i++){
            System.out.println("week:"+i);
            for (int k=1;k<4;k++){
                System.out.println("day:"+k);
            }
        }
    }
}
