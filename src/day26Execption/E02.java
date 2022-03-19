package day26Execption;

public class E02 {

    public static void main(String[] args) {

        String arr[]={"Ali","Can","Veli","Han"};
        getAnElementsFromAnArray(arr,2);//veli
        getAnElementsFromAnArray(arr,0);//Ali
        getAnElementsFromAnArray(arr,4);//ArrayIndexOutOfBoundsException==> Index 4 out of bands for length 4

    }
    public static void getAnElementsFromAnArray(String  arr[],int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("a error occurred in Array Operation : "+e.getMessage());
        }

    }
}
