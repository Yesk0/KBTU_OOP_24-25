package lab3.problem6;

public class Student extends Person{
	private int courseYear;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int courseYear) {
		super(name, age);
		this.courseYear = courseYear;
	}
	
	public String toString() {
		return super.toString() + " " + courseYear;
	}
}
