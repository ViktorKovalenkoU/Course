import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.printf("Парне число: %d%n", n));


        List<String> words = List.of("Java", "Lambda", "Stream");
        words.stream()
                .map(w -> w.length())
                .forEach(w -> System.out.printf("Довжина слова: %d%n", w));


        List<Person> personList = new ArrayList<>(List.of(
                new Person("Viktor", 25),
                new Person("Alex", 26),
                new Person("Roman", 33)
        ));
        personList.sort((p1, p2) -> Integer.compare(p1.ageAge, p2.ageAge));
        System.out.println("Sorted by age: " + personList);
        personList.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Sorted by name: " + personList);


        List<Integer> sumNumbers = List.of(1, 2, 3, 4);
        int sum = sumNumbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of integers: " + sum);


        List<String> randomWords = List.of("mother", "father", "grandmother");
        Predicate<String> containsA = s -> s.contains("a");
        List<String> filter = randomWords.stream()
                .filter(containsA)
                .collect(Collectors.toList());
        System.out.println("Words contains 'a': " + filter);


        List<String> stringList = List.of("Anna", "Bob", "Christina", "Dan");
        List<String> result = stringList.stream()
                .filter(s -> s.length() <= 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Less than 3 characters in string: " + result);


        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> (int) Math.pow(n, 2))
                .sum();
        System.out.println("Even square numbers sum: " + evenSum);


        Predicate<Integer> isPositive = n -> n > 0;
        List<Integer> randomNumbers = List.of(1,5,2,-4,-2,0,10,8,-3);
        randomNumbers.stream()
                .filter(isPositive)
                .sorted()
                .limit(3)
                .toList()
                .forEach(System.out::println);

        Function<String, Integer> toInt = Integer::valueOf;
        List<String> stringNumbers = List.of("10","5","25","15");
        List<Integer> newResult = stringNumbers.stream()
                .map(toInt)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("New Integer list of Strings reversed order: " + newResult);


        Consumer<String> printer = s -> System.out.println("->" + s);
        List<String> tasks = List.of("Design", "Code", "Test");
        tasks.stream()
                .forEach(printer);
    }

}

class Person {
    String name;
    int ageAge;

    public Person(String name, int ageAge) {
        this.name = name;
        this.ageAge = ageAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + name + '\'' +
                ", ageAge=" + ageAge +
                '}';
    }
}
