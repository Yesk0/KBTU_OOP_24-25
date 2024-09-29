package lab1;
import java.util.Scanner;
public class Temperature {
    // Поля для температуры и шкалы
    Scanner sc = new Scanner(System.in);
    private double temperature = sc.nextDouble();
    private char scale = sc.next().charAt(0);


    // Конструктор по умолчанию (ноль градусов Цельсия)
    public Temperature() {
        if(temperature == 0){
            this.scale = 'C';
            }
    }

    // Конструктор с температурой (по умолчанию Цельсий)
    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    // Конструктор с указанием шкалы (по умолчанию 0 градусов)
    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }

    // Конструктор с температурой и шкалой
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    // Метод для получения температуры в Цельсиях
    public double getTemperatureInCelsius() {
        if (scale == 'F') {
            return 5 * (temperature - 32) / 9;
        } else {
            return temperature;
        }
    }

    // Метод для получения температуры в Фаренгейтах
    public double getTemperatureInFahrenheit() {
        if (scale == 'C') {
            return (9 * (temperature / 5)) + 32;
        } else {
            return temperature;
        }
    }

    // Метод для установки температуры
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Метод для установки шкалы ('C' или 'F')
    public void setScale(char scale) {
        this.scale = scale;
    }

    // Метод для установки температуры и шкалы
    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    // Метод для получения текущей шкалы
    public char getScale() {
        return this.scale;
    }

    // Метод для красивого вывода температуры и шкалы
    public void displayTemperature() {
        System.out.printf("Temperature: %.2f %s%n", temperature, scale == 'C' ? "Celsius" : "Fahrenheit");
    }

    public static void main(String[] args) {
        // Тестовые случаи
        // 1. Температура по умолчанию (0C)
        Temperature temp1 = new Temperature();
        temp1.displayTemperature();
        System.out.printf("In Fahrenheit: %.2f F%n%n", temp1.getTemperatureInFahrenheit());

        // 2. Температура в Фаренгейтах 32 (должна быть 0C)
        Temperature temp2 = new Temperature(32, 'F');
        temp2.displayTemperature();
        System.out.printf("In Celsius: %.2f C%n%n", temp2.getTemperatureInCelsius());

        // 3. Установка температуры и шкалы (100C)
        temp2.setTemperatureAndScale(100, 'C');
        temp2.displayTemperature();
        System.out.printf("In Fahrenheit: %.2f F%n%n", temp2.getTemperatureInFahrenheit());
    }
}
