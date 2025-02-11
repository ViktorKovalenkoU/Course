package oop.practice9;

public class InheritanceChallenge {
    public static void main(String[] args) {

        Employee vic = new Employee("Victor", "16.02.2000", "01.09.2023");
        System.out.println(vic);
        System.out.println("Age= " + vic.getAge());
        System.out.println("Pay= " + vic.collectPay());
        System.out.println("___________");

        SalariedEmployee alex = new SalariedEmployee("Alex", "06.06.1999", "20.20.2030",20000);
        System.out.println(alex);
        System.out.println("Alex`s paycheck = $" + alex.collectPay());

        alex.retire();
        System.out.println("Alex`s pension check = $" + alex.collectPay());
        System.out.println("___________");

        HourlyEmployee roma = new HourlyEmployee("Roma","04.02.1992","10.10.2020",10);
        System.out.println(roma);
        System.out.println("Roma`s paycheck = $" + roma.collectPay());
        System.out.println("Roma`s holiday pay = $" + roma.getDoublePay());
    }
}

