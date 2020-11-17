package day17.task1;

public enum ChessPiece {
    KING_WHITE("♔",10), KING_BLACK("♚", 10),
    QUEEN_WHITE("♕", 9), QUEEN_BLACK("♛", 9),
    ROOK_WHITE("♖ ", 5), ROOK_BLACK("♜", 5),
    BISHOP_BLACK("♝ ", 3.5), BISHOP_WHITE("♗", 3.5),
    KNIGHT_BLACK("♞", 3), KNIGHT_WHITE("♘", 3),
    PAWN_BLACK("♟", 1), PAWN_WHITE("♙",1),
    EMPTY("_", -1);

    private double value;
    private String translation;

    ChessPiece(String translation, double value) {
        this.translation=translation;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", translation='" + translation + '\'' +
                '}';
    }
}
