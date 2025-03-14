package learn.chess;

public class Player {
    private String username;
    private int rating;

    public Player(String username) {
        this.username = username;
        this.rating = 500;
    }

    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public void updateRating(int change) {
        this.rating += change;
    }
}
