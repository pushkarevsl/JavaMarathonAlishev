package day17.task1;

public class App2 {
    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY}

        });

        chessBoard.print();
    }
}
