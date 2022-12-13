package day15_ForLoop;

public class FindEvenNumbers {
    public static void main(String[] args) {
        //print all even numbers between 1-55

        for(int i=1; i<=55; i++ ){

       if(i%2==0){
           System.out.print(i+" ");
       }

        }

        System.exit(0);
    }
}
