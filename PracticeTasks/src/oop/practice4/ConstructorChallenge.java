package oop.practice4;

public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Viktor", "Poltava", 1000);
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getLimit());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getAddress());
        System.out.println(secondCustomer.getLimit());

        Customer thirdCustomer = new Customer("Alex","Poltava", 2000);
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getAddress());
        System.out.println(thirdCustomer.getLimit());
    }
}
