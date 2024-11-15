package practice6;

import java.sql.Date;
import java.util.Random;

class Animal implements LivingThing {
    String name;
    int age = 0;
    int energy;
    Boolean alive = true;
    private final Date birthDay;


    int energyComsuption;
    SizeType size;
    AnimalClasses animalClass;
    int avgLifeSpan;

    //getters

    public Animal(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public void getName() {
        System.out.println(name);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getEnergy() {
        System.out.println(energy);
    }

    public void getAlive() {
        System.out.println(alive);
    }

    public void getBirthDay() {
        System.out.println(birthDay);
    }

    void setEnergy(int i) {
        energy = i;
    }

// Custom methods

    public void grow() {
        if (!checkAlive())
            return;
        age += 1;
        System.out.println(name + " is  now " + age + " y.o.");
//        STR.process("\{name} is now \{age} y.o");

        if (avgLifeSpan - 1 < age) {
            System.out.println("Be careful, " + name + " is in risk group");
        }
        if (avgLifeSpan >= age) return;

        Random random = new Random();
        int t = random.nextInt(100);
        if (t % avgLifeSpan * 2 - age == 0) {
            energy = 0;
            checkDeath();
        }

    }

    Boolean checkAlive() {
        if (alive) {
            return true;
        } else {
            System.out.println(name + " can't act, need a doctor(will be avaiible in next update)");
            return false;
        }
    }

    private void checkDeath() {
        if (energy <= 0) {
            System.out.println(name + " is dead :(");
            alive = false;
        }
    }

    // Livingthing mthods
    public void breathe() {
        if (checkAlive())
            System.out.println(size + " " + animalClass + " named " + name + " is consumed O2 and exhaling CO2.");
    }

    public void move(int distance) {
        if (!checkAlive())
            return;
        String text = "";
        int minEnergyForSurvival = 20;
        int energyToUse = energy - minEnergyForSurvival;
        int needEEnergy = distance * energyComsuption;

        if (needEEnergy > energyToUse) {
            distance = energyToUse / energyComsuption;
            text += "travelled less.\n";
        }
        if (distance == 0) {
            System.out.println("Haven't travelled");
            if (!text.isEmpty()) {
                System.out.println("Not enough energy, needs to restore.");
            }
            return;
        }
        System.out.println(text + "travelled " + distance + " meeters");
        energy -= distance * energyComsuption;
    }

    public void secretion() {
        if (!checkAlive())
            return;
        System.out.println("Fertilized for plants");

    }

    public void Metabolism(Food food) {
        if (checkAlive()) {
            energy += food.getEnergy();
            System.out.println(name + " hav eateen the " + food + " and gained " + food.getEnergy() + " currnt eneergy is " + energy);
            checkDeath();
        }
    }

    public void takeinfo() {
        if (!checkAlive())
            return;
        System.out.println("it can see, touch and hear");
    }

}
