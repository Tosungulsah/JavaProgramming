package practice;

public class RepeatMethod {
    public static void main(String[] args) {
        stars();
    }
    public static void stars (){
        for (int i = 1; i < 6 ; i++) {
            System.out.println("*".repeat(i));
        }
        }
}
