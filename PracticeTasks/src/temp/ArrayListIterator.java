package temp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
        }
    }
}
