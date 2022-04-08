package defaultPackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		int[] data = { 18, 4, 3, 9, 4, 2 };

		for (int number : data) {
			q.add(number);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Silmek istediginiz eleman: ");
		int value = Integer.parseInt(scanner.nextLine());

		removeAll(q, value);
		
		scanner.close();
	}

	public static void removeAll(Queue<Integer> q, int value) {

		int size = q.size();

		for (int counter = 0; counter < size; counter++) {
			int number = q.remove();
			
			System.out.println(number + " elemani cikarildi.");

			if (number != value) {
				q.add(number);
				System.out.println(number + " elemani eklendi.");
			}
		}

		System.out.println("Silindikten sonra = " + q);
	}

}
