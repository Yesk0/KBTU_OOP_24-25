package task4.Circuits;

public class Resistor extends Circuit
{
    private double resistance;
    private double potentialDiff;

    public Resistor(double resistance)
    {
        this.resistance = resistance;
    }

    public double getResistance()
    {
        return resistance;
    }

    public double getPotentialDiff()
    {
        return potentialDiff;
    }

    public void applyPotentialDiff(double V)
    {
        this.potentialDiff = V;
    }

    public String toString()
    {
        return "Resistor = " + resistance + " Ohms";
    }
}