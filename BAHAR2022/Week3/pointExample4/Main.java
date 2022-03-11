package pointExample4;

public class Main {

	public static void main(String[] args) {
		Point pnt = new Point(2, 3);
		
		System.out.println("point = (" + pnt.x + ", " + pnt.y + ")");
		System.out.println(pnt.distanceFromOrigin());
	}

}
