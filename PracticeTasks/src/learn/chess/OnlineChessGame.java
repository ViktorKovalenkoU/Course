package learn.chess;

public class OnlineChessGame {
    private Board board;
    private Player player1;
    private Player player2;
    private boolean isPlayer1Turn;
    private RatingSystem ratingSystem;

    public OnlineChessGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.isPlayer1Turn = true;
        this.ratingSystem = new RatingSystem();
        this.board = new Board();
    }

    public boolean makeMove(Move move) {
        if (board.isValidMove(move, isPlayer1Turn)) {
            board.applyMove(move);
            isPlayer1Turn = !isPlayer1Turn;
            return true;
        }
        return false;
    }

    public void endGame(String result) {
        if (result.equals("win")) {
            ratingSystem.updateRating(player1, 20);
            ratingSystem.updateRating(player2, -15);
        } else if (result.equals("lose")) {
            ratingSystem.updateRating(player1, -15);
            ratingSystem.updateRating(player2, 20);
        }
    }

    public Board getBoard() {
        return board;
    }
}
