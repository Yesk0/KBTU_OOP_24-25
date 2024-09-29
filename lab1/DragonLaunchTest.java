package lab1;
import java.util.Scanner;
public class DragonLaunchTest {
    public static void main(String[] args) {
        // Создание экземпляра DragonLaunch
        DragonLaunch dragonLaunch = new DragonLaunch();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        // Похищение некоторых людей (пример: B-B-G-G)
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == 'B'){
                dragonLaunch.kidnap(new Person(Gender.GIRL));
            }else if (c == 'B'){
                dragonLaunch.kidnap(new Person(Gender.BOY));
            }

        }

        // Отображение линии похищенных
        System.out.println("Kidnapped line: " + dragonLaunch);

        // Проверка, съест ли дракон студентов или нет
        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("The dragon will not have lunch.");
        } else {
            System.out.println("The dragon will have lunch.");
        }
    }
}

