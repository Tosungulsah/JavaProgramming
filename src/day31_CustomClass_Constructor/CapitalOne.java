package day31_CustomClass_Constructor;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.setInfo("Gulsah Tosun",123456789);

        account1.deposit(1000);

        account1.checkBalance();

        account1.withdraw(900);


        account1.deposit(900);

        account1.checkBalance();
        System.out.println("*********************************************************");

        BankAccount account2= new BankAccount();
        account2.setInfo("Ercument Tosun",451236987);
        account2.deposit(10000);
        account2.checkBalance();



    }

}
