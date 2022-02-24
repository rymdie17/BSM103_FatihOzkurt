package Metodlar;

import java.util.Scanner;

//Metodları öğreniyorum 4:
//Girilen kelimeyi tersten yazdıran program.

public class Fatih_OZKURT_uygulama4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir kelime giriniz: ");
		String word = scanner.nextLine();
		
		System.out.println("Girilen kelime: " + word);
		
		System.out.println("Kelimenin tersi: " + tersten(word));
		
	}
	
	public static String tersten(String kelime) {
		
		String ters = "";
		
		for (int sayac = kelime.length(); sayac > 0 ; sayac--) {
			ters += kelime.substring(sayac-1, sayac);
		}
		
		return ters;
		/*
		 * abc 0-a 1-b 2-c substring(1,3) = bc substring(1,2) = b gibi
		 * 
		 */
		
		/* kelime
		 * elimek
		 */
	}

}
