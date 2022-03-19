package JAVA_LESSON_TOTURAIL;

public class addMethod {

    //Write a code that adds given integers except the first one
    // and multiplies with the first integer.
    public static void main(String[] args) {
        add(10,1,2,3,4);

    }
     public static void add(int a,int...b){

        int sum=0;
        for (int result:b){
            sum=sum+result;
        }
         System.out.println("This is the Total:"+sum);
         int product=sum*a;
         System.out.println("Total * a:"+product);

     }

}
