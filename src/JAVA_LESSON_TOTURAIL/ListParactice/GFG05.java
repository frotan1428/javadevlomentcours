package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class GFG05 {


        public static void main(String[] args)
        {
            // creating an Empty Integer List
            List<Integer> arr = new ArrayList<Integer>(10);

            // check if the list is empty or not
            // using isEmpty() function
            boolean ans = arr.isEmpty();
            if (ans == true)
                System.out.println("The List is empty");
            else
                System.out.println("The List is not empty");

            // addition of a element to
            // the List
            arr.add(1);

            // check if the list is empty or not
            // after adding an element
            ans = arr.isEmpty();
            if (ans == true)
                System.out.println("The List is empty");
            else
                System.out.println("The List is not empty");
        }
}
