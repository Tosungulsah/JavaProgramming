package tasks;

public class Between2NumbersCustomMethod {
    public static void main(String[] args) {
        twoNumbers(20,55);
System.exit(0);
    }
    public static void twoNumbers(int x, int y){
        if(x<y) {
            for (int i = x + 1; i < y; i++) {
                System.out.print(i + " ");
            }
        }else {

            for (int i = x-1; i >y ; i--) {

                System.out.print(i+" ");
            }

        }
    }
}
