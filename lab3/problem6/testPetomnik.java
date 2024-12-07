package lab3.problem6;

public class testPetomnik {

    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science");
        Animal murka = new Dog("Murka", 5);
        Animal bird = new Bird("Tweety", 2);

        john.assignPet(murka);
        alice.assignPet(bird);

        john.takeCareOfPets();
        alice.takeCareOfPets();

        if (murka instanceof Trainable) {
            ((Trainable) murka).train();
        }

        System.out.println("John is older than Alice: " + (john.compareTo(alice) > 0));

        Person johnClone = john.clone();
        System.out.println("Cloned John: " + johnClone);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        registry.checkPet(john);
        registry.checkPet(alice);
    }
}
