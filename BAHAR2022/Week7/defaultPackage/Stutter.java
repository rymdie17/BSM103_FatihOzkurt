package defaultPackage;

import java.util.LinkedList;
import java.util.Queue;

public class Stutter {

	public static void main(String[] args) {
		// 3, 4, 8, 9, 1
		// 3, 3, 4, 4, 8, 8, 9, 9, 1, 1

		int[] data = { 3, 4, 8, 9, 1 };

		Queue<Integer> q = new LinkedList<>();

		for (int number : data) {
			q.add(number);
		}

		System.out.println(q);
		stutter(q);
		System.out.println(q);

	}

	public static void stutter(Queue<Integer> q) {

		int size = q.size();
		
		while(size > 0) {
			int temp = q.remove();
			q.add(temp);
			q.add(temp);
			size--;
		}
	}

}
