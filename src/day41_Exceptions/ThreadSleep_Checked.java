package day41_Exceptions;

public class ThreadSleep_Checked {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Cydeo");
    try{
    Thread.sleep(3000);
    }catch (InterruptedException e){
    e.printStackTrace();
    System.out.println("Catch block ");
    }
    System.out.println("Hello");

        System.out.println("Gulsah");
        Thread.sleep(2000);
        System.out.println("Tosun");
    }


}
