package mazeretSinavi;

import java.util.Scanner;

public class PalindromeV2 {

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
		
		int left = 0;
		int right = input.length() - 1;
		
		while(left < right) {
			if (input.charAt(left++) != input.charAt(right--)) {
				return false;
			}
		}
 		
		return true;
	}

}
