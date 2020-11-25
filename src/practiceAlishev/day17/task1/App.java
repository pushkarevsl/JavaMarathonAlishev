package practiceAlishev.day17.task1;

/**
 * Используя созданный enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
 * Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 */
public class App {

    public static void main(String[] args) {
        ChessPiece[] chessPieces = {
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK
        };

        for(ChessPiece chessPiece: chessPieces){
            System.out.print(chessPiece.getTranslation()+" ");
        }
    }
}
