package day42_ExceptionContinue;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("-------Push Up -----------");


        for (int i = 1; i <=30 ; i++) {
            System.out.println("\rpush up "+i);

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("******Push up completed*****");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("\rpull up "+i);

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("******Pull up completed*****");
    }



}
