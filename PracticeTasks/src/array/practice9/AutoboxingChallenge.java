package array.practice9;

import java.util.Arrays;

public class AutoboxingChallenge {
    public static void main(String[] args) {

        Bank bank = new Bank("Private");

        bank.addCustomer("Viktor");
        System.out.println(bank.addTransaction("Viktor", 150.5));
        System.out.println(bank.addTransaction("Viktor", -200.3));

        bank.addCustomer("Alex");
        System.out.println(bank.addTransaction("Alex", 200.52));
        System.out.println(bank.addTransaction("Alex", -123.4));

        for (Customer customer : bank.getCustomers()) {
            System.out.println(customer);
        }

    }
}
