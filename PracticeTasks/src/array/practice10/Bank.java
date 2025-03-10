package array.practice10;


import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchesName) {
        var branch = findBranch(branchesName);
        if (branch == null) {
            branches.add(new Branch(branchesName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchesName, String customersName, double initialTransaction) {
        var branch = findBranch(branchesName);
        if (branch != null) {
            branch.newCustomer(customersName, initialTransaction);
            return true;
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchesName, String customersName, double transaction) {
        var branch = findBranch(branchesName);
        if (branch != null) {
           return branch.addCustomerTransaction(customersName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchesName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchesName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchesName, boolean printTransactions) {
        Branch branch = findBranch(branchesName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");

                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
