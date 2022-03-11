package pointExample3;

public class Main {

	public static void main(String[] args) {
		Point pnt = new Point();
		pnt.x = 3;
		pnt.y = 4;
		
	//	pnt.translate(2, -1);
	//	System.out.println("point = (" + pnt.x + ", " + pnt.y + ")");
		
	//	pnt.translate(-5, -7);
	//	System.out.println("point = (" + pnt.x + ", " + pnt.y + ")");
		
		System.out.println("point = (" + pnt.x + ", " + pnt.y + ")");
		System.out.println("Distance from origin: " + pnt.distanceFromOrigin());

	}

}
