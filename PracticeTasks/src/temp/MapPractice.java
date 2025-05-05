package temp;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Viktor", 25);
        ages.put("Igor", 26);
        ages.put("Alex", 26);
        ages.put("Roma", 33);

        System.out.println("Viktor`s age: " + ages.get("Viktor"));

        if (ages.containsKey("Alex")) {
            System.out.println("Alex in the list.");
        }

        for (String name : ages.keySet()) {
            System.out.println(name + " age is " + ages.get(name));
        }
    }
}
