package challenges.challenge5;

public class Main {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.0625, -112.1350"),
                new Park("Yosemite National Park", "37.8050, -119.5850")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160,-95.23481", "29.1566,-89.2495", "35.1556,-90.0659"),
                new River("Missouri", "44.8880,-93.2160", "38.5833,-90.2500", "36.0000,-88.3333")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorado", "40.4708,-105.8286", "31.7811, -114.7724"),
                new River("Delaware", "38.9000,-75.5833", "38.0000, -75.0000"));

        riverLayer.renderLayer();
    }
}
