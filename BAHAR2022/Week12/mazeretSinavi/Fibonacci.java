package mazeretSinavi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		System.out.print("Uzunlugu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		
		run(input);
	}
	
	private static List<List<Integer>> fibonacciSeries(int numOfRows) {
		
		List<List<Integer>> fibonacci = new ArrayList<>();
		
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		
		fibonacci.add(temp);
		fibonacci.add(temp);
		
		for (int i = 2; i < numOfRows; i++) {
			List<Integer> firstPrevious = fibonacci.get(i-1);
			List<Integer> secondPrevious = fibonacci.get(i-2);
			
			int first = secondPrevious.get(secondPrevious.size() - 1);
			int second = firstPrevious.get(firstPrevious.size() - 1);
			
			List<Integer> list = new ArrayList<>();
			list.add(second);
			list.add(second + first);
			fibonacci.add(list);
		}
		
		System.out.println(fibonacci);
		return fibonacci;
	}
	
	private static void run(int numOfRows) {
		long start = System.currentTimeMillis();
		fibonacciSeries(numOfRows);
		long end = System.currentTimeMillis();
		
		long time = end - start;
		
		System.out.println("Executed in " + time + " ms.");
	}

}
