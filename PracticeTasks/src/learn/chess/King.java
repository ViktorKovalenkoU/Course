package learn.chess;

class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite);
    }

    public boolean isValidMove(Move move) {
        int deltaX = Math.abs(move.getToX() - move.getFromX());
        int deltaY = Math.abs(move.getToY() - move.getFromY());
        return deltaX <= 1 && deltaY <= 1 && (deltaX + deltaY > 0);
    }

}
