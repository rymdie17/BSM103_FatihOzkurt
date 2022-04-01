package pointWithSets;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Point> points = new HashSet<>();
		
		points.add(new Point(3, 4));
		points.add(new Point(5, 7));
		points.add(new Point(5, 7));
		// hafizada farkli referanslarda tutulduklari icin
		// ozellikleri ayni olsa dahi elemanlar eklenir.
		
		for (Point point : points) {
			System.out.println("(" + point.getX() + ", " + point.getY() + ")");
		}
	}

}
