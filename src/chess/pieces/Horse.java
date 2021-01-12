package chess.pieces;

import chess.ChessMove;
import chess.ChessState;
import chess.pieces.utils.PieceLocation;

public class Horse {
    PieceLocation pieceLocation;
    char piece;
    char color;

    public Horse(PieceLocation pieceLocation, char piece, char color) {
        this.pieceLocation = pieceLocation;
        this.piece = piece;
        this.color = color;
    }

    public static boolean isMovePossible(ChessState chessState, ChessMove chessMove){
    return true;
    }
}
