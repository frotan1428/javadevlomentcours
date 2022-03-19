package day13staticKeyWordVariableTypes;

public class Static01 {
    //Common Object in java is called "Static".
    // if they are not Common in java is called "instance". variable,method ,code Block, uses static keyword.
    // static variables and instance are used in every where bit local variable just use inside the main method.

    public static int sCounter=0;// To Create a static Variables(class Variable) use "static" keyword be for return type;
    public int iCounter=0; //To Create an instance Variables(object Variable)  do  not use"static. keyword be for return type;


    public Static01(){
        sCounter++;
        iCounter++;


    }
    public static void main(String[] args) {// args stand for arguments

         Static01 obj1=new Static01();
         Static01 obj2=new Static01();
         Static01 obj3=new Static01();

        System.out.println("values of sCounter:"+obj3.sCounter);//values of sCounter:3
        System.out.println(" Value of  iCounter:"+obj3.iCounter); //Value of  iCounter:1
        System.out.println("values of sCounter:"+obj2.sCounter);//values of sCounter:3
        System.out.println(" Value of  iCounter:"+obj2.iCounter);//Value of  iCounter:1

        System.out.println("values of sCounter:"+obj1.sCounter);//values of sCounter:3
        System.out.println(" Value of  iCounter:"+obj1.iCounter);//Value of  iCounter:1

        int age=13;//1)if you create a variable inside a Method it is called"Local Variable".
                    // 2)Normally java assign default value to variable, but it is Local variables' java does not assign value;
                    // because of that when you use a local variables you have to assign value before using to value.
                    //3) local Variables can not use outside the variables.

        System.out.println(age);
        add(3,5);//The real variable use in method called "argument".
    }
    public static int add(int a,int b){//the variable like "int a" and "int b" is called "parameter".
            int c=2;// it is local variable because it is inside method.
         return a+b+c;
    }

}
