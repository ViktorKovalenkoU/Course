package oop.practice1;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount +
                " made. New balance is $" + accountBalance);
    }

    public void withdrawalFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" +
                    accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount +
                    " processed, Remaining balance = $" + accountBalance);
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
