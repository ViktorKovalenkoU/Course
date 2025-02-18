package oop.practice16;

public class Burger {
    private double price;
    private String type;
    private String topping1;
    private String topping2;

    public Burger(String type, String topping1, String topping2) {
        this.type = type;
        this.price = setPriceByType(type) + setToppingPrice(topping1) + setToppingPrice(topping2);
        this.topping1 = topping1;
        this.topping2 = topping2;
    }

    private static double setPriceByType(String type) {
        switch (type.toLowerCase()) {
            case "cheeseburger":
                return 3.0;
            case "chicken burger":
                return 5.0;
            case "mushroom burger":
                return 5.0;
            case "beef burger":
                return 5.0;
            case "deluxe burger":
                return 7.0;
            default:
                throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }

    private static double setToppingPrice(String topping) {
        switch (topping.toLowerCase()) {
            case "tomato topping":
            case "condiment topping":
            case "pickle topping":
            case "onion topping":
            case "lettuce topping":
                return 0.5;
            default:
                throw new IllegalArgumentException("Unknown topping type: " + topping);
        }
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
