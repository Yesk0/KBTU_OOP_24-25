package task2.Chess;

public class Position
{
    int x;
    int y;

    public Position(String pos)
    {
        if(pos.length() == 2)
        {
            char character = pos.charAt(0);
            char number = pos.charAt(1);

            this.x = 8 - (number - '0');
            this.y = character - 'A';
        }
    }

    public boolean isValid() 
    {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }
}