package array.practice7;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class LinkedListChallenge {
    public static void main(String[] args) {

        LinkedList<Place> placesList = new LinkedList<>();

        placesList.addFirst(new Place("Sydney", 0));
        placesList.add(new Place("Adelaide", 1374));
        placesList.add(new Place("Alice Springs", 2771));
        placesList.add(new Place("Brisbane", 917));
        placesList.add(new Place("Darwin", 3972));
        placesList.add(new Place("Melbourne", 877));
        placesList.add(new Place("Adelaide", 1374));
        placesList.add(new Place("Perth", 3923));

        Collections.sort(placesList, new Comparator<Place>() {
            @Override
            public int compare(Place p1, Place p2) {
                return Integer.compare(p1.getDistance(), p2.getDistance());
            }
        });

        Scanner sc = new Scanner(System.in);
        String textBlock = """
                |Available actions (select word or letter|
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
        System.out.println("Choose an action");
        ListIterator<Place> iterator = placesList.listIterator(0);
        boolean quit = false;

        while (!quit) {
            String action = sc.nextLine().toUpperCase();
            switch (action) {
                case "F":
                    if (iterator.hasNext()) {
                        System.out.println("Now visiting " + iterator.next().getName());
                    } else {
                        System.out.println("Reached the end of the list.");
                    }
                    break;
                case "B":
                    if (iterator.hasPrevious()) {
                        System.out.println("Now visiting " + iterator.previous().getName());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case "L":
                    System.out.println("Places in the list:");
                    for (Place place : placesList) {
                        System.out.println(place.getName() + " (" + place.getDistance() + " km)");
                    }
                    break;
                case "M":
                    System.out.println(textBlock);
                    break;
                case "Q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid action. Choose an option from the menu.");
            }
        }
    }
}