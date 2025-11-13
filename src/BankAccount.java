public class BankAccount {

    protected double balance;

    public BankAccount(){
        balance = 0.0;
    }

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depositSum){
        if (depositSum <= 0 ){
            System.out.println("Deposit sum cannot be negative or zero.");
            return;
        }
        balance += depositSum;
        System.out.println(depositSum + " Lek were successfully deposited.");
    }

    public void withdraw(double withdrawSum){
        if (withdrawSum <= 0 ){
            System.out.println("Withdraw sum cannot be negative or zero.");
            return;
        }
        if (withdrawSum > balance){
            System.out.println("You don't have enough balance in your bank account.");
            return;
        }
        balance -= withdrawSum;
        System.out.println(withdrawSum + " Lek were successfully withdrawn.");
    }

}
