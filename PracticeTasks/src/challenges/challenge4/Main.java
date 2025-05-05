package challenges.challenge4;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Viktor", 100, 5);
        Monster monster = new Monster("Wolf", 30, 2);

        System.out.println(player);
        System.out.println(monster);
    }
}
