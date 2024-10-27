package task5.PetManagment;

public class PhDStudent extends Person
{
    private String research;
    private String major;

    public PhDStudent(String name, int age, String major, String research)
    {
        super(name, age);
        this.research= research;
        this.major = major;
    }

    public String getOccupation()
    {
        return "PhDStudent of " + research + " major :" + major;
    }

    public void assignPet (Animal pet)
    {
        if (pet instanceof Cat)
        {
            System.out.println("PhDStudent can't have a catt");
        }
        else
        {
            super.assignPet(pet);
        }
    }
}