package sortExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("siralanmadan once: " + words);
		
		// ilk indexteki eleman
		System.out.println(words.get(0));
		
		// alfabetik siralama
		Collections.sort(words);
		
		System.out.println("siralamadan sonra: " + words);
	}

}
