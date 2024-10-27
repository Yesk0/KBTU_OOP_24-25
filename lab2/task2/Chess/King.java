package task2.Chess;

public class King extends Piece
{
    public King(Position a)
    {
        super(a);
    }

    public boolean isLegalMove(Position b)
    {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return dx <= 1 && dy <= 1;
    }
}