package chess;

public class ChessCell {
    char color;
    char piece;


    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();
        sb.append(color);
        sb.append(piece);
        return sb.toString();
    }

    public ChessCell() {
        this.color = '-';
        this.piece = '-';
    }

    public ChessCell(char color, char piece) {
        this.color = color;
        this.piece = piece;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getPiece() {
        return piece;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }

    public void makeEmpty()
    {
        this.color = '-';
        this.piece = '-';
    }

    public boolean isEmpty(){
        if (this.color == '-' && this.piece == '-'){
            return true;
        }
        else if (this.color != '-' && this.piece != '-'){
            return false;
        }
        else {
            throw new IllegalArgumentException(" Invalid Cell");
        }
    }

    public boolean isEquals(ChessCell chessCell){
        return this.color == chessCell.color && this.piece == chessCell.piece;
    }

    public boolean isOpponent(ChessCell currentCell){
        return  (this.color != currentCell.color);
    }
}
