package superdemo3;

public class Box2 extends Box1 {
	int x =100;
	void display() {
		int x = 50;
				System.out.println(this.x);
		System.out.println(super.x);
	}
public static void main(String args[]) {
	Box2 b = new Box2();
	b.display();
	
}
}
