public class Main {
    public static void main(String[] args) {
    isCatPlaying(true,10);
    isCatPlaying(false,36);
    isCatPlaying(false,35);
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}