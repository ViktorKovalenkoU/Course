package array.practice9;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer addCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        Customer newCustomer = new Customer(name);
        customers.add(newCustomer);
        return newCustomer;
    }

    public String addTransaction(String customerName, double money) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                customer.addTransaction(money);
                return "Transaction of " + String.format("%.2f", money) + " added for " + customerName;
            }
        }
        return "Customer not found";
    }
}
