package learn.chess;

abstract class Piece {
    private boolean isWhite;
    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(Move move);
}
