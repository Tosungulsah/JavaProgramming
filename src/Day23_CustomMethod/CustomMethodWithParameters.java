package Day23_CustomMethod;

public class CustomMethodWithParameters {
    // Create a function that can chech if its a odd number or even number
    public static void main(String[] args) {
        oddOrEven(10);

    }


    public static void oddOrEven(int number) {
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }
}
