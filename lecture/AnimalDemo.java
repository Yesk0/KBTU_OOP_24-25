package lecture;


public class AnimalDemo {
    public static void main() {
        Bird bird = new Bird("Parrot", 2);
        Fish fish = new Fish("Goldfish", 1);
        Monkey monkey = new Monkey("Chimp", 3);
        Dog dog = new Dog("Bulldog", 4);


        bird.makeSound();
        bird.move();
        bird.sleep();
        bird.eat(30);
        bird.fly(10);
        bird.walk(5);
        System.out.println("Bird's energy: " + bird.energy);


        fish.makeSound();
        fish.move();
        fish.sleep();
        fish.eat(20);
        fish.swim(10);
        System.out.println("Fish's energy: " + fish.energy);


        monkey.makeSound();
        monkey.move();
        monkey.sleep();
        monkey.eat(40);
        monkey.walk(8);
        monkey.climb(5);
        System.out.println("Monkey's energy: " + monkey.energy);


        dog.makeSound();
        dog.move();
        dog.sleep();
        dog.eat(50);
        dog.walk(6);
        dog.swim(3);
        System.out.println("Dog's energy: " + dog.energy);
    }
}

