package lpa.collections;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

//        List<Card> deck = Card.getStandardDeck();
//        Card.printDeck(deck);

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
           numbers.add(random.nextInt(100) + i);
        }
        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);


        Collections.sort(numbers);
        int key = numbers.get(5);
        int index = Collections.binarySearch(numbers, key);
        System.out.println("Binary search for " + key + ": index " + index);

        int freq = Collections.frequency(numbers, key);
        System.out.println("Number frequency for " + key + ": is " + freq);

        System.out.println("Collection min number: " + Collections.min(numbers));
        System.out.println("Collection max number: " + Collections.max(numbers));

        Collections.rotate(numbers, 3);
        System.out.println("Rotated by 3: " + numbers);
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
