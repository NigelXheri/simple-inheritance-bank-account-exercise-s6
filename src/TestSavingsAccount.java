public class TestSavingsAccount {

        public static void main(String[] args) {

            SavingsAccount account1 = new SavingsAccount(1000, 5);

            account1.deposit(200);

            account1.withdraw(150);

            account1.addInterest();

            System.out.println("Balance: " + account1.getBalance() + " Lek.");

        }

}
