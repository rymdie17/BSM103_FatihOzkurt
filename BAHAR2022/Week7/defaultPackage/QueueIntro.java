package defaultPackage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {

	public static void main(String[] args) {

		String[] data = { "Java", "Php", "Python", "C", "C++" };
		
		Queue<String> q = new LinkedList<String>();
		
		//Stack push pop size isEmpty
		//Queue add remove size isEmpty
		
		for(String word : data) {
			q.add(word);
		}
		
		System.out.println("Queue = " + q);
		System.out.println("Peek = " + q.peek());
		System.out.println("Size = " + q.size());
	}

}
