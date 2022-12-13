package day15_ForLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum= 0;
        for (int i = 0; i < 101; i++) { // 1.... 99 100
            sum += i;
        }
        System.out.println(sum);
        System.exit(0);
    }
}

