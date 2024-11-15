package lecture;


class Fish extends Animal implements CanSwim {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is silent.");
    }

    @Override
    public void move() {
        System.out.println("Fish is moving by swimming.");
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

