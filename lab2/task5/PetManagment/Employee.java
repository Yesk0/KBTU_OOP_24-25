package task5.PetManagment;

public class Employee extends Person
{
    private String job;

    public Employee(String name, int age, String job)
    {
        super(name, age);
        this.job = job;
    }

    public String getOccupation()
    {
        return "Employee = " + job;
    }
}