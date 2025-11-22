package RandomPractice.WordsCounter;

public class WordsCounter {
    public static void main(String[] args) {
        String str = "Hello world, my name is Viktor";
        counter(str);
    }

    public static void counter(String str) {
        String[] text = str.trim().split("\\s+");
        System.out.println(text.length);
    }
}
