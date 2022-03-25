package vocabulary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(
				"C:\\Users\\Rymdie\\eclipse-workspace\\project1\\AlgoritmaHafta\\Week5\\sortExample\\test.txt"));

		ArrayList<String> list = new ArrayList<>();
		list = getWords(scanner);

		System.out.println(list);
		
		scanner.close();

	}

	public static ArrayList<String> getWords(Scanner scanner) {

		ArrayList<String> words = new ArrayList<>();
		
		while (scanner.hasNext()) {
			words.add(scanner.next().toLowerCase());
		}
		
		Collections.sort(words);
		System.out.println(words);
		
		ArrayList<String> result = new ArrayList<>();
		
		// dongu ile diziye benzersiz ogeler alma kontolu
		if (words.size() > 0) {
			
			result.add(words.get(0));
			
			for (int i = 1; i < words.size(); i++) {
				if (!words.get(i).equals(words.get(i - 1))) {
					result.add(words.get(i));
				}
			}
		}
		
		return result;
	}
	
}
