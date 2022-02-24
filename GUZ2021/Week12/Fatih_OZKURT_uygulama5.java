package Metodlar;

import java.util.Scanner;

//Metodları öğreniyorum 5:
//Girilen kelimeyi istenilen sayı kadar bölerek yazdıran program.

public class Fatih_OZKURT_uygulama5 {

	public static void main(String[] args) {
		
		System.out.println("\t# HOŞGELDİNİZ #");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir kelime giriniz: ");
		String word = scanner.nextLine();
		
		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		
		/*
		 * bubirdeneme mesajıdır
		 * 3
		 * 
		 * bub
		 * ird
		 * ene
		 * mem
		 * esa
		 * jıd
		 * ır   bu kısmı yazmaz
		 */
		
		splitWord(word, number);
		
	}
	
	public static void splitWord(String word, int number) {
		int index = 0;
		
		for (int sayac = 0; sayac < word.length()/number ; sayac++) {
			System.out.println(word.substring(index, index + number));
			index+=number;
		}
		
		System.out.println(word.substring(index, word.length())); // kalan kısmı da yazmak için kullandık.
			/*
			 * 0 0+3  0 3   bub
			 * 1 3+3  3 6   ird
			 * 2 6+3  6 9   ene
			 * 3 9+3  9 12  mem
			 * 		  12 15 esa
			 * 		  15 18 jıd
			 * 		  18 21 ır  ?
			 */		   
	}

}
