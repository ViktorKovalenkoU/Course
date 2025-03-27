package challenges.challenge4;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoints));
        data.add(String.valueOf(strength));
        data.add(weapon);
        return data;
    }

    @Override
    public void read(List<String> dataList) {
        if (dataList == null) {
            return;
        }
        if (dataList.size() <= 0) {
            return;
        }
        this.name = dataList.get(0);
        this.hitPoints = Integer.parseInt(dataList.get(1));
        this.strength = Integer.parseInt(dataList.get(2));
        this.weapon = dataList.get(3);
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
