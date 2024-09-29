package lab1;

import java.util.ArrayList;

public class Course {
    private final String name;
    private final String description;
    private final int credits;
    private ArrayList<String> prerequisites;

    // Конструктор
    public Course(String name, String description, int credits, ArrayList<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Course{name='" + name + "', description='" + description + "', credits=" + credits + "}";
    }
}
