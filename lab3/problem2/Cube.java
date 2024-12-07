package lab3.problem2;

public class Cube implements Moveable, iZMoveable{
	private int[] pos;
	
	public Cube() {
		pos = new int[3];
		pos[0] = 0;
		pos[1] = 0;
		pos[2] = 0;
	}

	@Override
	public void move(int a,int b) {
		pos = new int[3];
		pos[0] = a;
		pos[1] = b;
	}

	@Override
	public void move(int a, int b, int z) {
		pos = new int[3];
		this.pos[0] = a;
		this.pos[1] = b;
		this.pos[2] = z;
		
	}
	
	
	public void showPos() {
		for(int pos : pos) {
			System.out.println(pos);
		}
	}
	
}

