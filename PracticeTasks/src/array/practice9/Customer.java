package array.practice9;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public double getBalance() {
        double balance = 0.0;
        for (double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=$" + transactions +
                ", current balance=$" + String.format("%.2f", getBalance()) +
                '}';
    }
}
