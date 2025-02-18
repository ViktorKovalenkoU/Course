package oop.practice16;

public class BillsBurgerChallenge {
    public static void main(String[] args) {


        Burger burger = new Burger("Cheeseburger","pickle topping","condiment topping");
        Drink.Cola cola = new Drink.Cola("medium");
        SideItem sideItem = new SideItem("tube");

        double totalPrice = burger.getPrice() + cola.getPrice() + sideItem.getPrice();

        System.out.println("Your order is: " + burger.getType() + ", " + cola.getType() +
                ", " + sideItem.getType() + ". Total cost is $" + totalPrice);


        DeluxeOrder deluxeOrder = new DeluxeOrder("onion topping","pickle topping");
        System.out.println("Your Deluxe order total cost is $" + deluxeOrder.getPrice());
    }
}
