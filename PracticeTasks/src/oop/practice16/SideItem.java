package oop.practice16;

public class SideItem {
    private String type;
    private double price;

    public SideItem(String type) {
        this.type = type;
        this.price = setPriceByType(type);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    private static double setPriceByType(String type) {
        switch (type.toLowerCase()) {
            case "tube":
                return 0.25;
            case "napkins":
                return 0.25;
            default:
                throw new IllegalArgumentException("Unknown side item type: " + type);
        }
    }
}
