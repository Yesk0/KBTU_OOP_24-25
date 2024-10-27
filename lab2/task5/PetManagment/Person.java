package task5.PetManagment;

public abstract class Person
{
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void vacation(){

        if (this.hasPet()){
            System.out.println("YOU CANT LEAVE YOUR LITTLE PET ALONEE BAASTARD!!!!!");
        }else {
            System.out.println(this + " is gone for vacation");
            System.out.println(this + " is back from vacation");
        }
    }

    public void assignPet(Animal pet)
    {
        this.pet = pet;
    }

    public void removePet()
    {
        this.pet = null;
    }

    public boolean hasPet()
    {
        return this.pet != null;
    }

    public Animal getPet()
    {
        return this.pet;
    }

    public abstract String getOccupation();

    public String toString()
    {
        String petInfo;
        if (hasPet())
        {
            petInfo = pet.toString();
        }
        else
        {
            petInfo = "No pet";
        }
        return name + " (" + age + ", " + getOccupation() +") \n Pet:" + petInfo;
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

        Person person = (Person) obj;
        return age == person.age && name == person.name;
    }

    public int hashCode()
    {
        return name.hashCode() + age;
    }

    public void leavePet(Person keeper)
    {
        if (this.pet != null)
        {
            if (keeper instanceof PhDStudent && this.pet instanceof Cat)
            {
                System.out.println("PhDStudent can't take care of Cat");
            }
            else
            {
                keeper.assignPet(this.pet);
                this.removePet();
                System.out.println(this.name + " left" + keeper.getPet().getName() + " with" + keeper.getName());
            }
        }
        else
        {
            System.out.println(this.name + " has no pet to leave");
        }
    }

    public void retrievePet(Person keeper)
    {
        if (keeper.getPet() != null && this.pet == null)
        {
            this.assignPet(keeper.getPet());
            keeper.removePet();
            System.out.println(this.name + " took their pet " + this.getPet().getName() + " from " + keeper.getName());
        }
        else
        {
            System.out.println("No pet to retrieve");
        }
    }

    public String getName()
    {
        return name;
    }
}