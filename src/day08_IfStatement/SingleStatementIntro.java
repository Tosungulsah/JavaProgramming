package day08_IfStatement;

public class SingleStatementIntro {
    public static void main(String[] args) {

        int number = 100;

        boolean evenNumber= number %2 ==0;
        boolean oddNumber=! evenNumber;

        if(evenNumber) {
            System.out.println(number + " is even number ");

        }
        if(oddNumber) {
            System.out.println(number + " is odd number");
        }
    }
}






