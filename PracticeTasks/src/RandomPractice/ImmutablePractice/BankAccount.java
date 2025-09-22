package RandomPractice.ImmutablePractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

final public class BankAccount {

    private final String accountNumber;
    private final String ownerName;
    private final BigDecimal balance;
    private final List<String> transactions;

    public BankAccount(String accountNumber, String ownerName, BigDecimal balance, List<String> transactions) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactions = List.copyOf(transactions);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public BankAccount withDeposit(BigDecimal amount) {
        List<String> newTransactions = new ArrayList<>(this.transactions);
        newTransactions.add("Deposit" + amount);
        return new BankAccount(accountNumber, ownerName, balance.add(amount), newTransactions);
    }
}
