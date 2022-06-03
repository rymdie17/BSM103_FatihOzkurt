package functionalProgramming;

import java.util.stream.IntStream;

public class LambdaDeneme {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		
		int sum = IntStream.of(arr).filter(n -> n%2 == 0).sum();
		System.out.println(sum);

	}

}
