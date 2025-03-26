package challenges.сhallenge2;

public class Main {
    public static void main(String[] args) {
        MapItem mapItem = new MapItem("Example point", "POINT", "star-icon", "Extra Data");
        Mappable.printProperties(mapItem);
        System.out.println("Additional Field: " + mapItem.getAdditionalField());

        Building building = new Building("City Hall", "building-icon");
        UtilityLine utilityLine = new UtilityLine("Power Line", "line-icon");
        System.out.println("Building:");
        Mappable.printProperties(building);
        System.out.println("\nutility Line");
        Mappable.printProperties(utilityLine);
    }
}
