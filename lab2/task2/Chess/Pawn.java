package task2.Chess;

public class Pawn extends Piece
{
    boolean FirstMove = true;

    public Pawn(Position a)
    {
        super(a);
    }

    public boolean isLegalMove(Position b)
    {
        int dx = b.x - a.x;
        int dy = Math.abs(a.y - b.y);
        if (dx == 1 && dy == 0 && !FirstMove)
        {
            return true;
        }
        if (FirstMove && dx == 2 && dy == 0)
        {
            FirstMove = false;
            return true;
        }
        return dx == 1 && dy == 1;
    }
}