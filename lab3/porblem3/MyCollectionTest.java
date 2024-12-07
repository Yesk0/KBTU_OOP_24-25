package lab3.porblem3;

import java.util.Iterator;

public class MyCollectionTest {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyArrayList<>();

        // Тестируем добавление элементов
        myCollection.add("Первый");
        myCollection.add("Второй");
        myCollection.add("Третий");

        // Проверка размера и содержимого
        System.out.println("Размер коллекции: " + myCollection.size()); // Ожидается 3
        System.out.println("Содержит 'Второй': " + myCollection.contains("Второй")); // Ожидается true

        // Тестируем удаление элемента
        myCollection.remove("Второй");
        System.out.println("Содержит 'Второй' после удаления: " + myCollection.contains("Второй")); // Ожидается false

        // Тестируем итератор
        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println("Элемент: " + iterator.next());
        }

        // Тестируем очистку коллекции
        myCollection.clear();
        System.out.println("Размер после очистки: " + myCollection.size()); // Ожидается 0
    }
}
