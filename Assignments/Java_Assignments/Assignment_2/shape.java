
abstract class shape {
	abstract void draw();
}
class Line extends shape{
	void draw() {
		System.out.println("Draw Line");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}
class Cube extends shape{
	void draw() {
		System.out.println("Draw Cube");
	}
}
class Mainshape{
	public static void main(String args[]) {
		shape sp = new Line();
		sp.draw();
		shape sp1 = new Rectangle();
		sp1.draw();
		shape sp2 = new Cube();
		sp2.draw();
		
	}
}
