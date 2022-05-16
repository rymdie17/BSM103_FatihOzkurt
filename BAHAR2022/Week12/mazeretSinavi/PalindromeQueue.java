package mazeretSinavi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {

	public static void main(String[] args) {
		System.out.print("Kelime giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		if (validPalindrome(input)) {
			System.out.println("Kelime palindromdur!");
		} else {
			System.out.println("Palindrom degildir!!");
		}

	}

	private static boolean validPalindrome(String input) {
		
		if (input.length() == 0) {
			return false;
		}
		
		if (input.length() == 1) {
			return true;
		}
		
		Queue<Character> q = new LinkedList<>();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			q.add(input.charAt(i));
		}
		
		String reverse = "";
		while(!q.isEmpty()) {
			reverse += q.remove();
		}
		
		return input.equals(reverse);
	}

}
