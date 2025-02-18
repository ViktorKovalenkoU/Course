package oop.practice16;

public class Drink extends MealOrder {
    private String size;

    public Drink(String type, String size) {
        super(type, getPriceBySize(type, size));
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    private static double getPriceBySize(String type, String size) {
        if (type.toLowerCase().equals("cola")) {
            switch (size.toLowerCase()) {
                case "small":
                    return 1;
                case "medium":
                    return 1.5;
                case "large":
                    return 2;
                default:
                    throw new IllegalArgumentException("Wrong size: " + size);
            }
        }
        throw new IllegalArgumentException("Unknown drink type: " + type);
    }

    public static class Cola extends Drink {
        public Cola(String size) {
            super("Cola", size);
        }
    }
}
