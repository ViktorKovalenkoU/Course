package challenges.challenge4;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoints));
        data.add(String.valueOf(strength));
        return data;
    }

    @Override
    public void read(List<String> dataList) {
        if (dataList != null) {
            return;
        }
        if (dataList.size() <= 0) {
            return;
        }
        this.name = dataList.get(0);
        this.hitPoints = Integer.parseInt(dataList.get(1));
        this.strength = Integer.parseInt(dataList.get(2));
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "'}";
    }
}