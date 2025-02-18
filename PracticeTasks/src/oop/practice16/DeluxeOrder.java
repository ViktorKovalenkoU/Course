package oop.practice16;

public class DeluxeOrder {
    private double totalPrice;
    private Burger burger;
    private Drink drink;
    private SideItem sideItem1;
    private SideItem sideItem2;



    public DeluxeOrder(String extraTopping1, String extraTopping2) {


        this.burger = new Burger("deluxe burger", "condiment topping", "lettuce topping");
        this.burger = new Burger("deluxe burger", extraTopping1, extraTopping2);
        this.drink = new Drink("cola", "large");
        this.sideItem1 = new SideItem("tube");
        this.sideItem2 = new SideItem("napkins");

        this.totalPrice = burger.getPrice() + drink.getPrice() + sideItem1.getPrice() + sideItem2.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
