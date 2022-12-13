package tasks;

public class ReserveAString {
    public static void main(String[] args) {

        String input = "Wooden Spoon";

      String result= "";


        for (int i = input.length()-1; i >= 0; i--) {
          //  result += input.charAt(input.length()-1);

          result += input.charAt(i);

        }
        System.out.print(result);

    }
}
