package practice3;

public class Bear extends Animal{

	public String color;
	public int numberOfBones;
	
    public Bear(String name, int age, String color, int numberOfBones) {
        super(name, age); 
        this.color = color;
        this.numberOfBones = numberOfBones;
    }
    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

   
    public int getNumberOfBones() {
        return numberOfBones;
    }

    
    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }
    public void setNumberOfBones() {
        this.setNumberOfBones(200);
    }
  
    public void sound() {
        super.sound();  
        System.out.println("Roar!");
    }

 
    public void sound(String volume) {
        System.out.println("Roar at " + volume + " volume!");
    }
  
    public String toString() {
        return "Bear[Animal[name = " + getName() + ", age = " + getAge() + "]]" + ", color = " + color + ", numberOfBones = " + numberOfBones + ";";
    }
}
	
	


