package day20_Arrays;

public class AverageNUmbers {
    public static void main(String[] args) {
        int[] numbers = {10,200,300,50};

        int sum= 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println((double)sum/ numbers.length);
    }
}
