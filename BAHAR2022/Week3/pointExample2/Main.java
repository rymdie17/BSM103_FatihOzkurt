package pointExample2;

public class Main {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		point1.x = 5;
		point1.y = -7;
		
		Point point2 = new Point();
		point2.x = -3;
		point2.y = 4;
		
		System.out.println("point1 = (" + point1.x + ", " + point1.y + ")");
		double dist1 = Math.sqrt(Math.pow(point1.x, 2) + Math.pow(point1.y, 2));
		System.out.println("Distance from origin: " + dist1);
		
		System.out.println("point2 = (" + point2.x + ", " + point2.y + ")");
		double dist2 = Math.sqrt(Math.pow(point2.x, 2) + Math.pow(point2.y, 2));
		System.out.println("Distance from origin: " + dist2);
		
		
		// translate new location
		point1.x += 10;
		point1.y += 6;
		point2.x += 1;
		point2.y += 7;
		System.out.println("point1 = (" + point1.x + ", " + point1.y + ")");
		System.out.println("point2 = (" + point2.x + ", " + point2.y + ")");
		
		
	}

}
