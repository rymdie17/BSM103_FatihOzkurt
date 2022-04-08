package defaultPackage;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		
		String[] data = {"Java", "Php", "Python", "C", "C++"};
		
		Stack<String> s = new Stack<String>();
		
		// set - add
		// map - put
		// push, pop, peek
		for(String word: data) {
			s.push(word);
		}
		
		// peek, pop, push, isEmpty
		System.out.println("Stack = " + s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack = " + s);
		System.out.println(s.size());
		
		// Nerelerde kullanilabilir
		//	LIFO last in first out
		// 	text editorlerde geri alma islemi
		// 	internet sayfalarinda geri donme islemi
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
			System.out.println("Stack = " + s);
		}
		
		
	}

}
