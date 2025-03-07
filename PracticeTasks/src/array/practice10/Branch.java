
package array.practice10;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customersName, double initialTransaction) {
        var customer = findCustomer(customersName);
        if (customer == null) {
            customers.add(new Customer(customersName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customersName, double transaction) {
        var customer = findCustomer(customersName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customersName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customersName)) {
                return customer;
            }
        }
        return null;
    }
}
