package lpa.lambdas;

public class Transaction {
    private int id;
    private double amount;
    private Type type;
    public Transaction(int id, double amount, Type type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }
}
