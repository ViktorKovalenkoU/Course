package lpa.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        System.out.println("Even numbers:");
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).stream()
                .filter(e -> e % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
                .lines()
                .forEach(System.out::println);

        System.out.println("-----");

        System.out.println("Squaring:");
        List.of(1, 2, 3, 4, 5, 6, 7)
                .stream()
                .map(n -> n * n)
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
                .lines()
                .forEach(System.out::println);

        System.out.println("-----");

        System.out.println("Max string length:");
        List.of("alpha", "bravo", "charlie", "echo")
                .stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println("-----");

        System.out.println("All strings starts with 'A':");
        List.of("alphabet", "nuts", "book", "dog", "anger", "helicopter", "airplane")
                .stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .collect(Collectors.joining(" "))
                .lines()
                .forEach(System.out::println);

        System.out.println("-----");

        System.out.println("Names to uppercase:");
        List.of("viktor", "alex", "roman", "igor", "ivan")
                .stream()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "))
                .lines()
                .forEach(System.out::println);

        System.out.println("-----");

        System.out.println("Digit sum:");
        int sum = List.of(12, 14, 2, 5, 23, 9)
                .stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("-----");

        System.out.println("Person list (age sort, older than, only names)");
        List<Person> people = List.of(
                new Person("Viktor", 16),
                new Person("Alex", 17),
                new Person("Roman", 24),
                new Person("Igor", 30),
                new Person("Ivan", 22)
        );
        people.stream()
                .filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println("-----");

        System.out.println("Max/Min list number:");
        List<Integer> numbers = List.of(5, 21, 14, 10, 38, 6, 15);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("-----");

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n >= 50)
                .toList();
        System.out.println("Squares more than 50: " + squares);

        System.out.println("-----");

        List<String> string = List.of("Java lambda practice");
        long sumOfChars = string.stream()
                .mapToLong(s -> s.chars().distinct().count())
                .sum();
        System.out.println("Sum of chars: " + sumOfChars);

        System.out.println("-----");

        List<Transaction> transactions = List.of(
                new Transaction(1, 2500.40, Type.INCOME),
                new Transaction(2, 1200.10, Type.OUTCOME),
                new Transaction(3, 800.50, Type.INCOME),
                new Transaction(4, 500.50, Type.OUTCOME)
        );
        double incomeSum = transactions.stream()
                .filter(t -> t.getType() == Type.INCOME)
                .mapToDouble(Transaction::getAmount)
                .sum();

        double outcomeSum = transactions.stream()
                .filter(t -> t.getType() == Type.OUTCOME)
                .mapToDouble(Transaction::getAmount)
                .sum();

        double averageTransaction = transactions.stream()
                .mapToDouble(t -> t.getAmount())
                .average()
                .orElse(0);

        //just FLEX
        System.out.println("|==================================|" + "\n" +
                           "|         FINANCIAL REPORT         |" + "\n" +
                           "|==================================|");
        System.out.printf("%-20s : %10.2f%n", "Total Income", incomeSum);
        System.out.printf("%-20s : %10.2f%n", "Total Outcome", outcomeSum);
        System.out.printf("%-20s : %10.2f%n", "Average Transaction", averageTransaction);



       /* List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------");
        list.forEach((var myString) -> System.out.println(myString));

        System.out.println("----------");
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });

        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;*/
    }
}
