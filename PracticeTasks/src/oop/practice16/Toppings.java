package oop.practice16;


public class Toppings extends MealOrder {
    public Toppings(String type) {
        super(type, setPriceByType(type));
    }

    private static double setPriceByType(String type) {
        switch (type.toLowerCase()) {
            case "tomato topping":
                return 0.5;
            case "condiment topping":
                return 0.5;
            case "pickle topping":
                return 0.5;
            case "onion topping":
                return 0.5;
            case "lettuce topping":
                return 0.5;
            default:
                throw new IllegalArgumentException("Unknown topping type: " + type);
        }
    }
}