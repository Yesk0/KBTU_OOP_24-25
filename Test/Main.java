package Test;//package practice6;

import java.sql.Date;

import practice6.Cat;
import practice6.Food;
import practice6.Person;
import practice6.Restaurant;

public class Main {
    public static void main(String[] args) {
//        CanHavePizza cat = new Cat();
//        CanHavePizza person = new Person();
//        cat.eat();
//        person.eat();
//
//        Restaurant restaurant = new Restaurant();
//        restaurant.service(cat);
//        restaurant.service(person);
//
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30));
//        people.add(new Person("Bob", 25));
//        people.add(new Person("Charlie", 35));
//
//        // Sort the list using the natural order defined by compareTo
//        Collections.sort(people, Collections.reverseOrder());
//
//        System.out.println("Sorted people by age:");
//        for (Person person : people) {
//            System.out.println(person);
//        }
    Date bday = new Date(1999,12,1);

    Cat cat1 = new Cat("Barsik", bday);
    cat1.grow();
    cat1.breathe(); ;
    cat1.Metabolism(Food.Doner);
    cat1.move(123123123);
    cat1.Metabolism(Food.Beer);
    cat1.secretion();
    cat1.takeinfo();
    cat1.Metabolism(Food.Vodka);

    Restaurant r = new Restaurant();
    r.getMenu();


    Person p = new Person("Izya",bday);
    p.buyFood(r,Food.Beer);
    p.buyFood(r,Food.Sweets);
    p.buyFood(r,Food.Doner);
    p.buyFood(r,Food.Doner);
    p.work();



    }
}
