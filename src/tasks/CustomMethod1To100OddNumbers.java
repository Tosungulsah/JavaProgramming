package tasks;

public class CustomMethod1To100OddNumbers {
    public static void main(String[] args) {
        OddNumbers();
System.exit(0);
    }

    public static void OddNumbers(){
        for (int i = 1; i < 101; i+=2) {
            System.out.print(i+" ");
        }

    }

}
