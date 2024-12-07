package lab3.problem6;

public class Dog extends Animal implements Trainable {
    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof Woof";
    }

    @Override
    public void train() {
        System.out.println(name + " is being trained!");
    }
}