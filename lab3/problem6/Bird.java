package lab3.problem6;

public class Bird extends Animal {
	public Bird() {
		
	}
		
	public Bird(String name, int age) {
			super(name, age);
	}
	
	@Override
	public String getSound() {
			// TODO Auto-generated method stub
			return "Chick Chiric";
		}
	}


