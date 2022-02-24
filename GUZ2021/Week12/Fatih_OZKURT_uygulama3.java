package Metodlar;

import java.util.Scanner;

//Metodları öğreniyorum 3:
//Diziye belli elemanlar alan elemanların ortalamasını alıp ekrana ortalamayı yazdıran program.

public class Fatih_OZKURT_uygulama3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kaç sayı olsun: ");
		int length = scanner.nextInt();
		if (length >= 0) {
			int[] array = new int[length];
			
			for (int sayac = 0; sayac < length ; sayac++) {
				System.out.print(sayac+1 + ". elemanı giriniz: ");
				
				array[sayac] = scanner.nextInt();
			}    
			
			double ortalama = ortalama(array);
			System.out.println(ortalama);
			
		}else
			System.out.println("Eleman sayısı negatif olamaz!!");
	}
	
	public static double ortalama(int[] array) {
		double ortalama = 0.0;
		int toplam = 0;
		for (int sayac = 0; sayac < array.length; sayac++) {
			toplam += array[sayac];
		}
		ortalama = (double) toplam / array.length;
		return ortalama;
	}

}
