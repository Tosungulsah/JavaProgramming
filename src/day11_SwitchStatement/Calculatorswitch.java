package day11_SwitchStatement;

public class Calculatorswitch {
    public static void main(String[] args) {

        double n1=250.5;
        double n2=10.25;
        char operator ='%';
        boolean valid = operator=='+'|| operator=='-'||operator=='*'||operator=='/';

        if(valid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                break;
                case '-':
                    System.out.println(n1-n2);
                break;
                case '*':
                    System.out.println(n1*n2);
                break;
                default:
                    System.out.println(n1/n2);
                break;
            }


        }else{
            System.err.println("Invalid Operator: "+operator);
        }







    }
}
