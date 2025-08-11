import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Classes and objects
        Book book = new Book("Faust", "Wolfgang von Goethe", 1832);
        System.out.println(book);

        //reverse string
        //v1
        String original = book.toString();
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("reversed = " + reversed);

        //v2
        String original1 = book.toString();
        String reversed1 = "";
        for (int i = original1.length() - 1; i >= 0; i--) {
            reversed1 += original.charAt(i);
        }
        System.out.println("reversed1 = " + reversed1);

        //array
        int[] arr = {1,2,3,4,12,5,6};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("First max arr number: " + max);
        System.out.println("Second max arr number: " + secondMax);

        //stream
        List<Integer> topTwoNumbers = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                /*.skip(1)
                .findFirst
                no limit needed, just second max*/
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(topTwoNumbers);

        //hashmap
        Map<String, Integer> result = WordCounter.countWords(book.toString());
        System.out.println(result);

        //enum, switch
        DayOfTheWeek today = DayOfTheWeek.MONDAY;
        Boolean todayIsAWeekend = WeekendChecker.dayChecker(today);
        if (todayIsAWeekend) {
            System.out.println(today + " is a weekend.");
        } else {
            System.out.println(today + " is a weekday.");
        }

        //file Reader-Writer
        String inputPath = "input.txt";
        String outputPath = "output.txt";
        FileProcessor.replaceJavaWithPython(inputPath,outputPath);
    }
}
