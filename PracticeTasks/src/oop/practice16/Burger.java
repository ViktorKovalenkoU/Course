package oop.practice16;

public class Burger extends MealOrder {

    public Burger(String type) {
        super(type, setPriceByType(type));
    }

    private static double setPriceByType(String type) {
        switch (type.toLowerCase()) {
            case "cheeseburger":
                return 3.0;
            case "deluxe burger":
                return 7.0;
            case "chicken burger":
                return 5.0;
            case "mushroom burger":
                return 5.0;
            case "beef burger":
                return 5.0;
            default:
                throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }
}
