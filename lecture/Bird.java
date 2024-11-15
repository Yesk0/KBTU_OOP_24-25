package lecture;


class Bird extends Animal implements CanFly, CanWalk {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping!");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving by flying.");
    }

    @Override
    public void fly(int distance) {
        int energyRequired = distance * 5;
        if (hasEnoughEnergy(energyRequired)) {
            energy -= energyRequired;
            System.out.println(name + " flew " + distance + " meters.");
        }
    }

    @Override
    public void walk(int distance) {
        int energyRequired = distance * 2;
        if (hasEnoughEnergy(energyRequired)) {
            energy -= energyRequired;
            System.out.println(name + " walked " + distance + " meters.");
        }
    }
}
