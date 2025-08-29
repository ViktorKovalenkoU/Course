package temp.tempAI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsPractice {
    public static void main(String[] args) {
        uniqueValues(List.of(3, 1, 2, 3, 1));
        System.out.println(wordCount("Java language, Java Beans, Spring Beans, best language"));
    }


    public static Map<String, Integer> wordCount(String text) {
        return Arrays.stream(
                        text.toLowerCase()
                                .replaceAll("[^a-zа-яіїєґ0-9 ]", " ")
                                .split("\\s+")
                )
                .collect(Collectors.toMap(
                                word -> word,
                                word -> 1,
                                Integer::sum

                        )
                );
    }

    public static void uniqueValues(List<Integer> values) {
        values.stream()
                .distinct()
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
