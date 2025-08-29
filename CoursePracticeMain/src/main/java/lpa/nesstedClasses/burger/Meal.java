package lpa.nesstedClasses.burger;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private double base = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal() {
        burger = new Burger("regular", base);
        drink = new Item("coke", "drink", 1.5);
        side = new Item("fries", "side", 2.0);
    }

    public void addBurgerToppings(String toppingName) {
        burger.addToppings(toppingName);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n".formatted(burger, drink, side);
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? base : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, price);
        }
    }

    private class Burger extends Item {
        private List<Item> toppings;

        public Burger(String name, double price) {
            super(name, "burger", price);
            toppings = new ArrayList<>();
        }

        public void addToppings(String toppingName) {
            double toppingPrice = switch (toppingName) {
                case "cheese", "onion" -> 1.0;
                case "bacon" -> 1.5;
                default -> 0.0;
            };
            toppings.add(new Item(toppingName, "topping", toppingPrice));
            setPrice(getPrice() + toppingPrice);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            if (!toppings.isEmpty()) {
                sb.append("\n  Toppings:");
                for (Item topping : toppings) {
                    sb.append("\n    ").append(topping.toString());
                }
            }
            return sb.toString();
        }
    }
}