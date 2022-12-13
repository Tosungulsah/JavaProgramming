package day25_MethodOverLoading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum= sumOfNumbers(20,85);
        System.out.println(sum);
        int sum2 = sumOfNumbers(2,4,5);
        System.out.println(sum2);
        int sum3 = sumOfNumbers(4,5,20,89);
        System.out.println(sum3);
    }

    public static int sumOfNumbers (int num1,int num2){

        return num1+num2 ;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;

    }
}
