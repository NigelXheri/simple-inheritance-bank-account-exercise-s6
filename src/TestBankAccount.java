public class TestBankAccount {

    public static void main(String[] args){

        BankAccount b1 = new BankAccount(100);
        b1.deposit(50);
        b1.withdraw(30);
        System.out.println("Your balance is " + b1.getBalance() + " Lek.");

    }

}
