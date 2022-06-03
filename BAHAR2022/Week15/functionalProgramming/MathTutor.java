package functionalProgramming;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MathTutor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		giveProblems(console, 3, "+", (x, y) -> x + y);
		//( parameters ) -> { exp }
	}
	
	public static void giveProblems(Scanner console, int numProblems, String text, IntBinaryOperator operator) {
		Random rnd = new Random();
		int numRight = 0;
		
		for (int i = 0; i < numProblems; i++) {
			int x = rnd.nextInt(12) + 1;
			int y = rnd.nextInt(12) + 1;
			
			System.out.print(x + " " + text + " " + y + " = ");
			
			int answer = operator.applyAsInt(x, y);
			int response = console.nextInt();
			
			if(response == answer) {
				System.out.println("dogru");
				numRight++;
			} else {
				System.out.println("Yanlis cevap: " + answer);
			}
			
		}
		
		System.out.println(numProblems + " cevaptan dogru sayisi: " + numRight);
	}
}
