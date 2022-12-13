package Day24_CustomMethod_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {

    int max = maxNumber(50,200);
        System.out.println(max);
    }
    // return max number between two numbers

    public static int maxNumber(int num1,int num2){

        int result = Math.max(num1, num2);

        return result;
    }
}
