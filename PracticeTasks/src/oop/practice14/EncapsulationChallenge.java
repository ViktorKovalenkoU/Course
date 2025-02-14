package oop.practice14;

public class EncapsulationChallenge {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.printf("current job pages: %d, printer total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.printf("current job pages: %d, printer total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        System.out.printf("current job pages: %d, printer total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(15);
        System.out.printf("current job pages: %d, printer total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(1980);
        System.out.printf("current job pages: %d, printer total: %d %n",
                pagesPrinted, printer.getPagesPrinted());


    }
}
