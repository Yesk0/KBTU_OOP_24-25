package task4.Circuits;

public abstract class Circuit
{
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);
    public double getPower() 
    {
        double V = getPotentialDiff();
        return V * V / getResistance();
    }

    public double getCurrent() 
    {
        return getPotentialDiff() / getResistance();
    }
}