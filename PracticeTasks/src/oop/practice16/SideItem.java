package oop.practice16;

public class SideItem extends MealOrder {
    public SideItem(String type) {
        super(type, setPriceByType(type));
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
