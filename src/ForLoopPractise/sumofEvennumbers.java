package ForLoopPractise;

public class sumofEvennumbers {
    public static void main(String[] args) {
            int sum= 0;
        for (int i = 0; i <= 10; i+=2) {
            sum+= i;
        }
        System.out.println(sum);
        System.exit(0);
    }
}
