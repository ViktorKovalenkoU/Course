package oop.practice16;

public class BillsBurgerChallenge {
    public static void main(String[] args) {

        Burger burger = new Burger("Cheeseburger"); // Пример с Cheeseburger


        Toppings topping1 = new Toppings("tomato topping");
        Toppings topping2 = new Toppings("pickle topping");


        Drink.Cola cola = new Drink.Cola("medium");


        SideItem sideItem = new SideItem("tube");

        double totalPrice = burger.getPrice() + topping1.getPrice() + topping2.getPrice() + cola.getPrice() + sideItem.getPrice();

        System.out.println("You ordered:");
        System.out.println(burger.getType() + " - Price: $" + burger.getPrice());
        System.out.println(topping1.getType() + " - Price: $" + topping1.getPrice());
        System.out.println(topping2.getType() + " - Price: $" + topping2.getPrice());
        System.out.println(cola.getType() + " - Price: $" + cola.getPrice());
        System.out.println(sideItem.getType() + " - Price: $" + sideItem.getPrice());
        System.out.println("Total Price: $" + totalPrice);
    }
}
