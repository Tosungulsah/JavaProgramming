package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4};
        try{
            System.out.println("Try block");
            System.out.println(arr[10]);
            System.out.println("Try2"); // this one wasnt printed

        }catch (RuntimeException e ){

            System.out.println("Catch Block");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }



    }
}
