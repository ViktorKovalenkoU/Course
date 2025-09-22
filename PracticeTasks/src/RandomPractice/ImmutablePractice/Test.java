package RandomPractice.ImmutablePractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> tx = new ArrayList<>();
        tx.add("Initial");

        BankAccount acc = new BankAccount("123", "Kovalenko", new BigDecimal(100.00), tx);

        tx.add("Hacked");

        System.out.println(acc.getTransactions());

        List<String> leaked = acc.getTransactions();
        leaked.add("Hacked again");

        System.out.println(acc.getTransactions());
    }
}
