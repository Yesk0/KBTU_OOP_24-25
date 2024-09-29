package lab1;

public class Person {
    private final Gender gender;

    // Конструктор
    public Person(Gender gender) {
        this.gender = gender;
    }

    // Геттер для Gender
    public Gender getGender() {
        return gender;
    }

    // Переопределение метода toString для отображения "B" для мальчика и "G" для девочки
    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}
