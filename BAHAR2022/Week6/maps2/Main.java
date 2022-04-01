package maps2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		Scanner input = new Scanner(new File("test.txt"));
		
		while (input.hasNext()) {
			String word = input.next().toLowerCase();
			
			if (!wordCount.containsKey(word)) {
				wordCount.put(word, 1);
			}
			else {
				int count = wordCount.get(word);
				wordCount.put(word, count + 1);
			}
		}
		System.out.println(wordCount);		
	}
}
