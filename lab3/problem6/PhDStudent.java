package lab3.problem6;

public class PhDStudent extends Person{
	private String Science;
	public PhDStudent() {
		
	}
	
	public PhDStudent(String name, int age, String Science) {
		super(name, age);
		this.Science = Science;
	}
	
	public String toString() {
		return super.toString() +  " " + Science;
	}
	
	
}
