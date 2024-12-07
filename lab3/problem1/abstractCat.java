package lab3.problem1;

public class abstractCat extends abstractExample{
    	String name = "Bulka";
    	int age = 18;
	
	
	
	public abstractCat(String name, int age) {
		super(name, age);
	}
	@Override
	public void Meow() {
		System.out.println("Meoooow");
		
	}
	
}
