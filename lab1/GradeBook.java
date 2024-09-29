package lab1;

import practice2.Student;
import java.util.ArrayList;

public class GradeBook {
    private final Course course;
    private final ArrayList<Student> students;
    private final ArrayList<Integer> grades;

    // Конструктор
    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Добавление студента и его оценки
    public void addStudent(Student student, int grade) {
        students.add(student);
        grades.add(grade);
    }

    // Метод для вывода сообщения
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + " Object Oriented Programming and design");
    }

    // Метод для отчёта об оценках
    public void displayGradeReport() {
        int sum = 0;
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        Student minGradeStudent = null;
        Student maxGradeStudent = null;

        // Подсчёт среднего балла и поиск минимальной и максимальной оценки
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            Student student = students.get(i);

            sum += grade;

            if (grade < minGrade) {
                minGrade = grade;
                minGradeStudent = student;
            }

            if (grade > maxGrade) {
                maxGrade = grade;
                maxGradeStudent = student;
            }
        }

        double average = sum / (double) grades.size();

        System.out.println("Class average is " + average);
        System.out.println("Lowest grade is " + minGrade + " (Student: " + minGradeStudent.getName() + ")");
        System.out.println("Highest grade is " + maxGrade + " (Student: " + maxGradeStudent.getName() + ")");
    }
    // Метод для распределения оценок
    public void displayGradeDistribution() {
        int[] distribution = new int[11];  // Диапазоны для оценок 0-9, 10-19, ..., 90-100

        for (int grade : grades) {
            distribution[grade / 10]++;
        }

        System.out.println("Grade Distribution:");
        for (int i = 0; i < distribution.length; i++) {
            if (i == 10) {
                System.out.println("100: " + "*".repeat(distribution[i]));
            } else {
                System.out.println(i * 10 + "-" + (i * 10 + 9) + ": " + "*".repeat(distribution[i]));
            }
        }
    }
}

