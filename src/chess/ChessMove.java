package chess;

public class ChessMove {
    ChessCell piece;

    public ChessCell getPiece() {
        return piece;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public int getDestLocation() {
        return destLocation;
    }

    int startLocation;
    int destLocation;


    public ChessMove(ChessCell piece, int startLocation, int destLocation) {
        this.piece = piece;
        this.startLocation = startLocation;
        this.destLocation = destLocation;

    }

    @Override
    public String toString() {
        return "ChessMove{" +
                "piece=" + piece +
                ", startLocation=" + startLocation +
                ", destLocation=" + destLocation +
                '}';
    }
}
