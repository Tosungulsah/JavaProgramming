package day20_Arrays;

public class MinNumberOfLoop {
    public static void main(String[] args) {
        int[] numbers ={7,200,1520,456,800};
        int min= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
              min= numbers[i];
            }
        }
        System.out.println(min);
        System.exit(0);
    }
}
