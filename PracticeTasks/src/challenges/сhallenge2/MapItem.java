package challenges.сhallenge2;

public class MapItem implements Mappable {
    private String label;
    private String geometryType;
    private String iconType;
    private String additionalField;

    public MapItem(String label, String geometryType, String iconType, String additionalField) {
        this.label = label;
        this.geometryType = geometryType;
        this.iconType = iconType;
        this.additionalField = additionalField;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getGeometryType() {
        return geometryType;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    public String getAdditionalField() {
        return additionalField;
    }
}