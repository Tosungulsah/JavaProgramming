package day41_Exceptions;

public class Try_Catch_Block {
    public static void main(String[] args) {

        System.out.println("Test started");
     try{
         System.out.println(9/0);
         System.out.println("Try block");
     }catch (ArithmeticException e){
         System.out.println("Catch Block");
         System.out.println("Arithmetic Exception is was occurred");
     }


        System.out.println("Test1 Completed");


        System.out.println("\n************************************************************");
        System.out.println("Test2 started");

        int[] numbers= {1,3,4,5};
      try{
          System.out.println(numbers[20]);
      }catch (RuntimeException e){
          System.out.println("Catch block ");

               // e.printStackTrace();
         System.out.println(e.getMessage());

      }
        System.out.println("test2 completed");

    }
}
