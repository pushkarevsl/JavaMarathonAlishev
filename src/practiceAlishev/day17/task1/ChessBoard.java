package practiceAlishev.day17.task1;

public class ChessBoard {
    ChessPiece[][] pieces;

    public ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public void print() {
        for(int i=0; i<pieces.length; i++){
            for(int j=0; j< pieces.length; j++){
                System.out.print(pieces[i][j].getTranslation());
            }
            System.out.println();
        }
    }
}
