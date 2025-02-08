package oop.practice1;

public class ClassesChallenge {
    public static void main(String[] args) {
        Account ViktorsAccount = new Account();
        Account AlexsAccount = new Account();


        ViktorsAccount.setAccountNumber(1);
        ViktorsAccount.setAccountBalance(1000);
        ViktorsAccount.setCustomerName("Victor");
        ViktorsAccount.setEmail("javatraining1337@gmail.com");
        ViktorsAccount.setPhoneNumber(380679495753l);
        ViktorsAccount.depositFunds(100);


        AlexsAccount.setAccountNumber(2);
        AlexsAccount.setAccountBalance(2500);
        AlexsAccount.setCustomerName("Alex");
        AlexsAccount.setEmail("*******");
        AlexsAccount.setPhoneNumber(380678215654l);
        AlexsAccount.withdrawalFunds(500);

        System.out.println();
    }
}
