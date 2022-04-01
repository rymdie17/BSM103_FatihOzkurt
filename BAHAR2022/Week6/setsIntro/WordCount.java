package setsIntro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test.txt");
		Scanner scanner = new Scanner(file);
		
		Set<String> words = countWords(scanner);
		
		System.out.println("Kelimeler: " + words);
		System.out.println("Kelime sayisi: " + words.size());

	}
	
	public static Set<String> countWords(Scanner scanner) {
		
		Set<String> words = new HashSet<>();
		
		while (scanner.hasNext()) {
			words.add(scanner.next().toLowerCase());
		}
		
		return words;
	}

}
