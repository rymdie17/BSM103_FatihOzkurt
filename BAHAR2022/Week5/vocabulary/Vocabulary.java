package vocabulary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("test.txt"));

		ArrayList<String> list = new ArrayList<>();
		list = getWords(scanner);

		System.out.println(list);
		
		scanner.close();

	}

	public static ArrayList<String> getWords(Scanner scanner) {

		ArrayList<String> words = new ArrayList<>();

		while (scanner.hasNext()) {
			String word = scanner.next().toLowerCase();
			
			// eleman ekleme
			//words.add(word);
			
			// while i�indeyken dosyadan gelen bir sonraki eleman listede yoksa ekle kontrolu
			if (!words.contains(word)) {
				words.add(word);
			}
			
			Collections.sort(words);
		}
		return words;
	}

}
