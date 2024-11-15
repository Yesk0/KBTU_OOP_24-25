package practice6;

import java.sql.Date;
import java.util.Random;

//public class Person implements CanHavePizza, Comparable<Person>{
public class Person extends Animal {
    int money = 2000;

    public Person(String name, Date birthDay) {

        super(name, birthDay);
        setEnergy(10000);
        avgLifeSpan = 70;
        energyComsuption = 7;
        size = SizeType.Medium;
        animalClass = AnimalClasses.Mammal;
        age = 2024 - birthDay.getYear();
    }

    public void talk(){
        System.out.println(name + " is talking as a psycho");
    }
    public void talk(Person p){
        System.out.println(name + " is talking with a "+ p.name );
    }
    public void talk(Cat c){
        System.out.println(name + " is healing mental wounds");
    }
    public void talk(Animal a){
        System.out.println(name + " is probably tryies to understand " + a.name);
    }

    public void work(){
        Random random = new Random();
        int t = random.nextInt(1234);
        int gained = t + 100;
        System.out.println(name+" worked at restraaunt and gained " +gained +" moneey" );
        money += gained;
    }

    public void buyFood(Restaurant r,Food f){
        if (r.buy(f,this)){
            Metabolism(f);
        }
    }

    @Override
    public void Metabolism(Food food) {
        super.Metabolism(food);
    }
}


//    public Person(){
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Someone is eating pizza");
//    }
//
//    @Override
//    public int compareTo(Person other) {
//        return Integer.compare(this.age, other.age); // Compare by age
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}
