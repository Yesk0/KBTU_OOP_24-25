package task1.subsuper;

import java.util.Objects;

public class Fridge extends Applience
{
    private int fridgeStorage;

    public Fridge(String CountryCreator, String model, int fridgeStorage)
    {
        super(CountryCreator, model);
        this.fridgeStorage = fridgeStorage;
    }

    public int getStorage()
    {
        return fridgeStorage;
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
        Fridge fridge = (Fridge) obj;
        return fridgeStorage == fridge.fridgeStorage;
    }

    public int hashCode()
    {
        return Objects.hash(super.hashCode(), fridgeStorage);
    }

    public String toString()
    {
        return "Fridge[" + "Country: " + getCountry() + ", Model: " + getModel() + ", Amount of Fridge Storage: " + fridgeStorage +  "]"; 
    }
}