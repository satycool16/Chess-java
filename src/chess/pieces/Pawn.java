package chess.pieces;

import chess.ChessCell;
import chess.ChessMove;
import chess.ChessState;
import chess.pieces.utils.PieceLocation;
import chess.pieces.interfaces.pieceInterface;

public class Pawn {
    PieceLocation pieceLocation;
    char piece;
    char color;

    public Pawn(PieceLocation pieceLocation, char piece, char color) {
        this.pieceLocation = pieceLocation;
        this.piece = piece;
        this.color = color;
    }

    public boolean canMoveStraight(){
        return true;
    }
    public  boolean canMoveDiagnol(){
        return false;
    }
    public boolean canMoveBack(){
        return false;
    }

    public static boolean isMovePossible(ChessState chessState, ChessMove chessMove){
        int start_i = chessMove.getStartLocation()/10;
        int start_j = chessMove.getStartLocation()%10;
        int dest_i = chessMove.getDestLocation()/10;
        int dest_j = chessMove.getDestLocation()%10;

        ChessCell currentChessCell =  chessMove.getPiece();
        ChessCell newChessCell = chessState.getCellAt(dest_i,dest_j);

        if (!chessState.getCellAt(dest_i,dest_j).isEmpty()){
            if (currentChessCell.getColor()=='W'){
                if(Math.abs(start_j-dest_j)!=1)
                    return false;
                else if (currentChessCell.isOpponent(newChessCell) == false)
                    return false;
                else
                    return true;
            }
            else if(currentChessCell.getColor()=='B'){
                if(Math.abs(start_j-dest_j)!=1)
                    return false;
                else if (currentChessCell.isOpponent(newChessCell) == false)
                    return false;
                else
                    return true;
            }
        }
        if (currentChessCell.getColor()=='W'){
            if(start_i > dest_i)
                return false;
            else if(start_i!=dest_i-1)
                return false;
            else
                return true;
        }
        else if(currentChessCell.getColor()=='B'){
            if(start_i < dest_i)
                return false;
            else if(start_i!=dest_i+1)
                return false;
            else
                return true;
        }
        return false;
    }
}
