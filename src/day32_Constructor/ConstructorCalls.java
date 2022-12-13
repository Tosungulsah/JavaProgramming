package day32_Constructor;

public class ConstructorCalls {
    public ConstructorCalls(){

        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();// our first constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this();
        //this(10);
        System.out.println(" Constructor with string argument  ");
    }

    public static void main(String[] args){
        ConstructorCalls obj1= new ConstructorCalls();
        System.out.println("***********************************");
        ConstructorCalls obj2= new ConstructorCalls(10);
        System.out.println("********************************************************");
        ConstructorCalls obj3= new ConstructorCalls("Java");


    }
}
