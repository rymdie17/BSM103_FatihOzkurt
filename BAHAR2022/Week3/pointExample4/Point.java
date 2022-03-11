package pointExample4;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanceFromOrigin() {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}
	
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
