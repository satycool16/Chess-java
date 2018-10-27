import chess.ChessCell;
import chess.ChessMove;
import chess.ChessState;

public class Main {

    public static void main(String[] args) {
        ChessState myChess = new ChessState();
        //myChess.print();
        myChess.init();
        System.out.println("New Chess");
        myChess.print();

        ChessMove[] chessMovesArr = {
                new ChessMove(new ChessCell('W','P'),12 , 22),
                new ChessMove(new ChessCell('W','P'),22 , 32),
                new ChessMove(new ChessCell('W','P'),32 , 42),
                new ChessMove(new ChessCell('W','P'),42 , 52),
                new ChessMove(new ChessCell('B','P'),63 , 52)
        };

        for (ChessMove chessMove: chessMovesArr) {
            if (myChess.isMovePossible(chessMove) == true) {
                System.out.println("Making a move: "+ chessMove);
                myChess.makeMove(chessMove);
                myChess.print();
            } else {
                System.out.println("Invalid move");
            }
        }
    }
}
