package task1.subsuper;

import java.util.Objects;

public class Applience
{
    private String CountryCreator;
    private String model;
    
    public Applience(String CountryCreator, String model)
    {
        this.CountryCreator = CountryCreator;
        this.model = model;
    }

    public String getCountry()
    {
        return CountryCreator;
    }

    public String getModel()
    {
        return model;
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
        Applience applience = (Applience) obj;
        return CountryCreator == applience.CountryCreator && model == applience.model;
    }

    public int hashCode()
    {
        return Objects.hash(CountryCreator, model);
    }

    public String toString()
    {
        return "Applience[" + "Country: " + CountryCreator + ", Model: " + model + "]"; 
    }
}