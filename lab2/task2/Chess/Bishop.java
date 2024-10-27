package task2.Chess;

public class Bishop extends Piece
{
    public Bishop(Position a)
    {
        super(a);
    }

    public boolean isLegalMove(Position b)
    {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return dx == dy;
    }
}