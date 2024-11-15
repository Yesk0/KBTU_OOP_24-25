package lecture;


class Monkey extends Animal implements CanWalk, CanClimb {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is screeching!");
    }

    @Override
    public void move() {
        System.out.println("Monkey is moving by walking and climbing.");
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
    public void climb(int height) {
        int energyRequired = height * 4;
        if (hasEnoughEnergy(energyRequired)) {
            energy -= energyRequired;
            System.out.println(name + " climbed " + height + " meters.");
        }
    }
}
