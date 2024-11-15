package lecture;


class Dog extends Animal implements CanWalk, CanSwim {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving by walking.");
    }

    @Override
    public void walk(int distance) {
        int energyRequired = distance * 2;
        if (hasEnoughEnergy(energyRequired)) {
            energy -= energyRequired;
            System.out.println(name + " walked " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        int energyRequired = distance * 3;
        if (hasEnoughEnergy(energyRequired)) {
            energy -= energyRequired;
            System.out.println(name + " swam " + distance + " meters.");
        }
    }
}
