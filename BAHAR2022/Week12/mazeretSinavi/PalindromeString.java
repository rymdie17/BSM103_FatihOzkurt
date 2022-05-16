package mazeretSinavi;

import java.util.Scanner;

public class PalindromeString {

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
		
		int length = input.length();
		
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		
		return input.equals(reverse);
	}

}
