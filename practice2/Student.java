package practice2;
public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345);
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year of Study: " + student.getYearOfStudy());

        student.incrementYearOfStudy();
        System.out.println("Year of Study after increment: " + student.getYearOfStudy());
    }
}

