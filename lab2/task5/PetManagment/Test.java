package task5.PetManagment;

public class Test
{
    public static void main(String[] args)
    {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 25, "Computer Science", "AI");

        Animal rex = new Dog("Rex", 5);

        john.assignPet(rex);
        System.out.println(john);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePet(alice);

        john.vacation();

        System.out.println(registry);

        john.retrievePet(alice);

        System.out.println(registry);


        john.removePet();
        Animal murka = new Cat("Murka", 3);

        john.assignPet(murka);
        System.out.println(john);

        john.leavePet(alice);

        john.vacation();

        System.out.println(registry);

        john.retrievePet(alice);

        System.out.println(registry);
    }
}