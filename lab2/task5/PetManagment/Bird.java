package task5.PetManagment;

public class Bird extends Animal
{
    public Bird(String name, int age)
    {
        super(name, age);
    }

    public String getSound()
    {
        return "Peep";
    }
}