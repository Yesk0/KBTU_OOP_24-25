package lab3.problem6;

public class Employee extends Person {
	private String workPlace;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String workPlace) {
		super(name, age);
		this.workPlace = workPlace;
	}
	
	public String toString() {
		return super.toString() + " " + workPlace;
	}
}
