package task5.PetManagment;

public class Cat extends Animal
{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    public String getSound()
    {
        return "Meow";
    }
}