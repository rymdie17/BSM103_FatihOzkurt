import java.util.Scanner;

public class sumToExp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı yaz: ");
		System.out.println(sumTo(scanner.nextDouble()));
	}


	public static double sumTo(double n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n == 0) {
			return 0.0;
		} else {
			return 1.0 / n + sumTo(n - 1);
		}
	}
}
