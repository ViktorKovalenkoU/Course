package oop.practice4;

public class Customer {
    private String name;
    private String address;
    private int limit;

    public Customer() {
        this("Nobody", "Nowhere");
    }

    public Customer(String name, String address) {
        this(name, address, 1999);
    }

    public Customer(String name, String address, int limit) {
        this.name = name;
        this.address = address;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getLimit() {
        return limit;
    }
}
