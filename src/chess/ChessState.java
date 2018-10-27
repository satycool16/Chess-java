package chess;

import chess.pieces.Pawn;

import java.util.Arrays;

public class ChessState {
    int r_size = 8;
    int c_size = 8;
    ChessCell[][] all_cells =  new ChessCell[r_size][c_size];;

    public ChessState() {
        for(int i=0; i < this.r_size; i++){
            for (int j=0; j< this.c_size; j++){
                all_cells[i][j]= new ChessCell();
            }
        }

    }

    public void init(){
        char color = '-';
        char piece = '-';
        for(int i=0; i<r_size; i++){
            for(int j=0; j<c_size; j++) {
                color = '-';
                piece = '-';
                if(i == 0 || i==1){
                    color ='W';
                }
                else if(i == 6|| i==7){
                    color = 'B';
                }
                if(i ==1 || i==6){
                    piece = 'P';
                }
                else if(i==0 || i==7){
                    if(j==0|| j==7){
                        piece= 'R';
                    }
                    if(j==1|| j==6){
                        piece= 'H';
                    }
                    if(j==2|| j==5){
                        piece= 'B';
                    }
                    if(j==3){
                        piece= 'Q';
                    }
                    if (j==4){
                        piece = 'K';
                    }
                }
                all_cells[i][j].setColor(color);
                all_cells[i][j].setPiece(piece);
            }
        }
    }

    public ChessCell getCellAt(int x, int y){
        return all_cells[x][y];
    }

    public boolean isMovePossible(ChessMove chessMove){
        int start_i = chessMove.startLocation/10;
        int start_j = chessMove.startLocation%10;
        int dest_i = chessMove.destLocation/10;
        int dest_j = chessMove.destLocation%10;

        ChessCell currentCell= getCellAt(start_i, start_j);
        //System.out.println(start_i + " "+ start_j);
        //System.out.println(currentCell.toString());
        if (chessMove.piece.isEquals(currentCell)!=true){
            return false;
        }

        if(chessMove.piece.piece == 'P'){
            return Pawn.isMovePossible(this,chessMove);
        }
        else
            return false;
    }

    public void makeMove(ChessMove chessMove){
        int start_i = chessMove.startLocation/10;
        int start_j = chessMove.startLocation%10;
        int dest_i = chessMove.destLocation/10;
        int dest_j = chessMove.destLocation%10;

        all_cells[dest_i][dest_j] = chessMove.piece;
        all_cells[start_i][start_j].makeEmpty();
    }

    public void print() {
        for(int i=0; i < this.r_size; i++){
            for (int j=0; j< this.c_size; j++){
                System.out.print(all_cells[i][j] + " ");
            }
            System.out.println();
        }
    }

}
