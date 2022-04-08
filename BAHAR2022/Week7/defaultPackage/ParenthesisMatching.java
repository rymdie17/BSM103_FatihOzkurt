package defaultPackage;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {

	public static void main(String[] args) {
		// (a+(b*c)-d)
		// acilan parantez sayisi kadar kapanan parantez sayisi esit mi
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("a: " );
		String s = scanner.nextLine(); //"(a+(b*c)-d)"
		
		System.out.println(isMatching(s));
		scanner.close();
	}
	
	public static boolean isMatching(String statement) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < statement.length(); i++) {
			char c = statement.charAt(i);
			if (c == '(') {
				stack.push(c);
			}
			else if(c == ')') {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else
					return false;
			}
		}
		return stack.isEmpty();
		
	}

}
