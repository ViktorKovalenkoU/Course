package oop.practice16;

public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = getPriceBySize(type,size);
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

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
