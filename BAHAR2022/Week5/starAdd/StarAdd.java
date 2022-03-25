package starAdd;

import java.util.ArrayList;

public class StarAdd {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("dongu oncesi: " + words);
		System.out.println("liste uzunlugu: " + words.size());
		
		for (int i = 0; i < words.size(); i+=2) {
			words.add(i, "*");
		}
		
		System.out.println("dongu sonrasi: " + words);
		System.out.println("liste uzunlugu: " + words.size());
		/*	Bastan sildirme:
		 * 
		  	for (int i = 0; i < words.size(); i++) {
		 		words.remove(i);
		    }
		 */
		// Sondan sildirme: 
		for (int i = words.size()-2; i >= 0; i-=2) {
			words.remove(i);
		}
		
		System.out.println("silme sonrasi: " + words);
		System.out.println("silme liste uzunlugu: " + words.size());
	}

}
