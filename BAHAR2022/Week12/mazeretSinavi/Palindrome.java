package mazeretSinavi;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Kelime giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		if(validPalindrome(input)) {
			System.out.println("Kelime palindromdur!");
		} else {
			System.out.println("Palindrom degildir!!");
		}
		
	}
	
	private static boolean validPalindrome(String input) {
		
		if (input.length() == 0) {
			return false;
		}
		
		if(input.length() == 1) {
			return true;
		}
		
		Stack<Character> s = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			s.push(input.charAt(i));
		}
		
		String reverse = "";
		while(!s.isEmpty()) {
			reverse += s.pop();
		}
		
		return input.equals(reverse);
		
//		for (int i = 0; i< input.length(); i++) {
//			if (input.charAt(i) == s.peek()) {
//				s.pop();
//			}
//		}
//	
//		return s.isEmpty();
	}

}
