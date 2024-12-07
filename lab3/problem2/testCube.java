package lab3.problem2;

public class testCube {
	public static void main(String[] args) {
		Cube cube = new Cube();
		
		
		cube.move(2, 3);
		cube.showPos();
		
		
		cube.move(5, 3, 3);
		cube.showPos();
	}
}

