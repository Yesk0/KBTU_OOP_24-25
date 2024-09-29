package lab1;

import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        // Создание курса
        ArrayList<String> prerequisites = new ArrayList<>();
        prerequisites.add("Introduction to Programming");
        Course course = new Course("CS101", "Object-Oriented Programming", 3, prerequisites);

        // Создание GradeBook
        GradeBook gradeBook = new GradeBook(course);

        // Вывод сообщения
        gradeBook.displayMessage();

        // Ввод студентов и их оценок через консоль
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {  // Для простоты ввода ограничимся 3 студентами
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();  // Очистка после nextInt()

            // Создание студента и добавление его в журнал с оценкой
            Student student = new Student(name, id);
            gradeBook.addStudent(student, grade);
        }

        // Отчёт по оценкам
        gradeBook.displayGradeReport();

        //Отображения распределения оценок
        gradeBook.displayGradeDistribution();
    }
}

