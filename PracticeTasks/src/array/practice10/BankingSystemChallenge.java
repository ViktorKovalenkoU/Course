package array.practice10;

public class BankingSystemChallenge {
    public static void main(String[] args) {

        Bank bank = new Bank("Ukrainian national bank");

        bank.addBranch("Private");

        bank.addCustomer("Private", "Viktor", 150.50);
        bank.addCustomer("Private", "Alex", 125.25);
        bank.addCustomer("Private", "Igor", 107.32);
        bank.addCustomer("Private", "Roman", 180);

        bank.addCustomerTransaction("Private", "Viktor", 42.24);
        bank.addCustomerTransaction("Private", "Igor", 289.10);
        bank.addCustomerTransaction("Private", "Roman", 14);

        bank.listCustomers("Private", true);

        bank.listCustomers("Private", false);
    }
}
