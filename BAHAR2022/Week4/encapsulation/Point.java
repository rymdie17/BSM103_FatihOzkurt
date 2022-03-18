package encapsulation;

public class Point {
	private int x;
	private int y;
	
	public Point(int initialX, int initialY) {
		setLocation(initialX, initialY);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx, int dy) {
		 setLocation(x + dx, y + dy);
	}
	
	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	
}
