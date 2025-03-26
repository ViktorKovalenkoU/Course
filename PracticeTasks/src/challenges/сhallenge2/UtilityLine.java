package challenges.сhallenge2;

public class UtilityLine implements Mappable {

    private String label;
    private String iconType;

    public UtilityLine(String label, String iconType) {
        this.label = label;
        this.iconType = iconType;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String getGeometryType() {
        return "LINE";
    }
}
