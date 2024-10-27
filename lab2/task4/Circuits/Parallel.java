package task4.Circuits;

public class Parallel extends Circuit
{
    private Circuit c1, c2;

    public Parallel(Circuit c1, Circuit c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getResistance()
    {
        return 1 / (1 / c1.getResistance() + 1 / c2.getResistance());
    }

    public double getPotentialDiff()
    {
        return c1.getPotentialDiff();
    }

    public void applyPotentialDiff(double V)
    {
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }

    public String toString()
    {
        return "Parallel: " + c1 + " ," + c2;
    }
}