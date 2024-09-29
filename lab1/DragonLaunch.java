package lab1;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> line;

    // Конструктор
    public DragonLaunch() {
        line = new Vector<>();
    }

    // Метод для похищения человека (добавление его в линию)
    public void kidnap(Person p) {
        if(line.isEmpty()){
            line.add(p);
        }else {
            Person per = line.lastElement();
            if (per.getGender() == Gender.BOY && p.getGender() == Gender.GIRL) {
                line.remove(per);
            } else {
                line.add(p);
            }
        }

    }


    // Метод для проверки, съест ли дракон студентов или нет
    public boolean willDragonEatOrNot() {
        int count = 0;



        return line.isEmpty();  // Если счётчик равен 0, дракон съест оставшихся
    }

    // Метод для отображения текущей линии студентов
    @Override
    public String toString() {
        StringBuilder lineString = new StringBuilder();
        for (Person p : line) {
            lineString.append(p.toString());
        }
        return lineString.toString();
    }
}
