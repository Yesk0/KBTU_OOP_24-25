import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends JFrame {

//    public Menu() {
//        List<Student> students = new ArrayList<Student>();
//        List<staff> staffs = new ArrayList<staff>();
//
//        // Создаем панель меню
//        JButton addStudent = new JButton("Add Student");
//        add(addStudent);
//        addStudent.setSize(100,100);
//        addStudent.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                students.add(new Student(1, "2", "3", "4", "5", 123);
//            }
//        })
//        JButton addStaff = new JButton("Add Staff");
//        add(addStaff);
//
//
//
//        // Устанавливаем размер окна и делаем его видимым
//        setSize(300, 200);
//        setVisible(true);
//    }

    public static void main(String[] args) {
//        new Menu();
        List<Student> students = new ArrayList<Student>();
        List<staff> staffs = new ArrayList<staff>();

        int selection = -1;
        Scanner sc = new Scanner(System.in);
        while (true){
            if(selection == -1){
                System.out.println("Press 0 to exit");
                System.out.println("Press 1 to add user");
                System.out.println("Press 2 to list users");
            }else if(selection == 1){
                System.out.println("Press 1 to add student");
                System.out.println("Press 1 to add staff");
                selection = sc.nextInt();
                if(selection == 1){
                    students.add( new Student(1,"2","3","4","5",123));

                }else if(selection == 2){
                    staffs.add( new staff(1,"2","3","4","5",123));
                }

            }else if(selection == 2){
                System.out.println("Press 1 to list users");
                System.out.println("Press 2 to list staffs");
                selection = sc.nextInt();
                if(selection == 1){
                    System.out.println(students);
                }
                else if(selection == 2){
                    System.out.println(staffs);
                }
            }else if(selection == 0){
                System.exit(0);
            }

            selection = sc.nextInt();

        }
    }
}