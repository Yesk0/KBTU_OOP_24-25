package lab3.problem6;

import java.util.Iterator;
import java.util.Vector;

public abstract class Person implements CareTaker, Comparable<Person>, Cloneable {
    protected String name;
    protected int age;
    protected Vector<Animal> a = new Vector<>();

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        if (pet == null) {
            throw new IllegalArgumentException("Pet cannot be null.");
        }
        a.add(pet);
    }

    public void removePet(Animal pet) {
        a.remove(pet);
    }

    public boolean hasPet() {
        return !a.isEmpty();
    }

    public Animal getPet() {
        if (!a.isEmpty()) {
            return a.get(0);
        }
        return null;
    }

    @Override
    public void takeCareOfPets() {
        for (Animal pet : a) {
            System.out.println(name + " is taking care of " + pet.getName());
        }
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.a = new Vector<>(this.a); // Глубокое копирование списка животных
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Person");
        }
    }

    @Override
    public String toString() {
        StringBuilder petsSounds = new StringBuilder();
        for (Animal pet : a) {
            petsSounds.append(pet.getSound()).append(" ");
        }
        return "Hello, my name is: " + name + ". I am " + age + " years old. My pet(s) sound: " + petsSounds.toString().trim();
    }
    
    public String getName() {
    	return name;
    }
}
