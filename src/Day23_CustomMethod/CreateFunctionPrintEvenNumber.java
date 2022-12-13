package Day23_CustomMethod;

public class CreateFunctionPrintEvenNumber {
    public static void main(String[] args) {
        evenNumber();
        System.exit(0);
    }



    public static void evenNumber(){
        for (int i = 2; i <= 10; i+=2) {

            System.out.println(i);
        }
    }
}
