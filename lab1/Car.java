package lab1;

enum FuelType{
    PETROL, DIESEL, ELECTRIC
}
public class Car {
    public static int totalCars = 0;
    private final String vinNumber;
    private int speed;
    private FuelType fuelType;
    private static final int MAX_SPEED = 200;
    {
        speed = 0;
    }
    public Car(String vinNumber, FuelType fuelType){
        this.vinNumber = vinNumber;
        this.fuelType = fuelType;
        totalCars=0;
    }
    public void setSpeed(int speed){
        if(speed <= MAX_SPEED){
            this.speed = speed;
        }
    }
    public void setSpeed(double speed){
        setSpeed((int) speed);
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public static int getTotalCars(){
        return totalCars;
    }
    public String toString(){
        return "Car{"+ "VIN='" + vinNumber + '\'' + ", speed=" + speed + ", fuelType=" + fuelType + '}';
    }
    public static void main(String[] args){
        Car car1 = new Car("ABC123", FuelType.PETROL);
        car1.setSpeed(120);
        System.out.println(car1);

        Car car2 = new Car("XYZ789", FuelType.ELECTRIC);
        car2.setSpeed(180.5);
        System.out.println(car2);

        System.out.println("Total cars: " + totalCars);
    }
}
