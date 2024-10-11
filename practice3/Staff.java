package practice3;

public class Staff extends Person{
	public String school;
	public Double pay;
	public Staff(String name, String address, String school, Double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool(){
		return school;
	}
	public Double getPay(){
		return pay;
	}
	
	public void setPay(Double pay) {
		this.pay = pay;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String toString() {
		return "Staff[Person[name = " + getName() + ", address = " + getAddress() + "]," + "school = " +getSchool() + ","
	+"pay = " +getPay() + "]";
	}
}
