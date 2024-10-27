package task5.PetManagment;

public abstract class Animal
{
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name + " (" + age + " years old, Sound like: " + getSound() + ")";
    }
}