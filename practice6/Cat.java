package practice6;

import java.sql.Date;
import java.util.*;

public class Cat extends Animal{

    private static final List<Food> notConsumablees = new ArrayList<>(List.of(Food.Beer));

    private int lives = 7;

    public Cat(String name, Date birthDay) {
        super(name, birthDay);
        setEnergy( 700);
        avgLifeSpan = 20;
        energyComsuption = 3;
        size = SizeType.Small;
        animalClass =AnimalClasses.Mammal;
    }

    @Override
    public void Metabolism(Food food) {
        if (notConsumablees.contains(food)){
            System.out.println("cats cannot eat "+ food);
            return;
        }
        if (!checkAlive())
            return;
        energy += food.getEnergy();
        System.out.println(name + " hav eateen the "+food+" and gained "+food.getEnergy()+" curent eneergy is "+ energy);
        checkDeath();

//        super.Metabolism(food);
    }
    private void checkDeath(){

        if(energy <= 0 ){
            if (lives>1){
                lives--;
                System.out.println("ITSA MIRACLEEE!!!");
                energy = 700;
                return;
            }
            System.out.println(name + " is dead :(");
            alive = false;
        }
    }

}
