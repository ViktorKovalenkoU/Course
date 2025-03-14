package learn.chess;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];
        initialize();
    }

    private void initialize() {
        grid[0][0] = new King(true);
    }

    public boolean isValidMove(Move move, boolean isWhiteTurn) {
        Piece piece = grid[move.getFromX()][move.getFromY()];
        if (piece == null || piece.isWhite() != isWhiteTurn) {
            return false;
        }
        return piece.isValidMove(move);
    }

    public void applyMove(Move move) {
        Piece piece = grid[move.getFromX()][move.getFromY()];
        grid[move.getFromX()][move.getFromY()] = null;
        grid[move.getToX()][move.getToY()] = piece;
    }
}

