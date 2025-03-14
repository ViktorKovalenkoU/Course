package learn.chess;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Viktor");
        Player player2 = new Player("Alex");

        OnlineChessGame game = new OnlineChessGame(player1, player2);

        System.out.println("The default position of the king is 0, 0");

        Move move = new Move(0,0,1,1);

        if (game.makeMove(move)){
            System.out.println("The king's move was successful. The king moved to (1, 1)");
        } else {
            System.out.println("Invalid move. The king was unable to move.");
        }
    }
}
