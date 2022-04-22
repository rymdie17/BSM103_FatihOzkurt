package sinav;

import java.util.Stack;

public class Parantheses {

	public static void main(String[] args) {
		System.out.println(validParantheses("({})[]{)"));
	}
	
	public static boolean validParantheses(String str) {
		Stack<Character> s = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c == '(' || c == '[' || c == '{') {
				s.push(c);
			}
			else if(!s.isEmpty()) {
				if(c == ')' && s.peek() == '(') {
					s.pop();
				} 
				else if (c == ']' && s.peek() == '[') {
					s.pop();
				} 
				else if (c == '}' && s.peek() == '{') {
					s.pop();
				}
				else
					return false;
			}
		}
		return s.isEmpty();
	}

}
