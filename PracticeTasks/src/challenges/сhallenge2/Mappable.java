package challenges.сhallenge2;


public interface Mappable {
    final String JSON_PROPERTY = """
            "properties" : {%s}
            """;

    String getLabel();

    String getGeometryType();

    String getIconType();

    default String toJSON() {
        return String.format("""
                {
                    "type" : "%s",
                    "label" : "%s",
                    "marker" : "%s"
                 }
                 
                     """, getGeometryType(), getLabel(), getIconType());
    }

    static void printProperties(Mappable mappable) {
        System.out.println("Label: " + mappable.getLabel());
        System.out.println("Geometry type: " + mappable.getGeometryType());
        System.out.println("Icon type: " + mappable.getIconType());
        System.out.println("JSON Representation: " + mappable.toJSON());
    }
}

