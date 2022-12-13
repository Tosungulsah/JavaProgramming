package day31_CustomClass_Constructor;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public void checkBalance(){
        System.out.println("Your available balance is :" + balance);
    }
    public void deposit(double amount){
    if(amount<=0){
        System.err.println("Deposit amount cant be 0 or negative");
        return;
    }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount> balance){
            System.err.println("Insufficient Balance");
            return;
        }
        if (amount<=0){
            System.err.println("Withdrawing account cant be 0 or neg.");
            return;
        }

        balance-= amount;

    }

}
