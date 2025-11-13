public class SavingsAccount extends BankAccount{

    private double  interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = balance*interestRate/100;
        balance += interest;
        System.out.println("Added interest of " + interest + " Lek");
    }

}
