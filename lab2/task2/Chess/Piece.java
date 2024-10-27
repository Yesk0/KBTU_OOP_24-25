package task2.Chess;

public abstract class Piece
{
    Position a;

    public Piece(Position a)
    {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);
}