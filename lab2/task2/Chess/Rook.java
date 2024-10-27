package task2.Chess;

public class Rook extends Piece
{
    public Rook (Position a)
    {
        super(a);
    }

    public boolean isLegalMove(Position b)
    {
        return a.x == b.x || a.y == b.y;
    }
}