package lpa.collections;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

      /*  Collection<String> list = new HashSet<>();

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? - " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? - " + list.contains("Gary"));*/
    }
}
