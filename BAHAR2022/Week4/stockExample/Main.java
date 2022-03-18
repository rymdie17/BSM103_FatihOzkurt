package stockExample;

import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Ilk magaza ismi: ");
		String storel = scanner.nextLine();   // Magaza ismi alma
		Stock stock1 = new Stock(storel);	  // stock1 un magaza ismini tanimlama
		int profit1 = makePurchases(stock1);  // stock1 i isleme yolluyoruz
			// stock1 in kar zarar durumu profit1 de tutulur
		System.out.println("------------------------------------");
		
		System.out.print("Ikinci magaza ismi: "); // Magaza ismi alma
		String store2 = scanner.nextLine();		  
		Stock stock2 = new Stock(store2);		  // stock2 nin magaza ismini tanimlama	
		int profit2 = makePurchases(stock2);	  // stock2 yi isleme yolluyoruz
			// stock2 nin kar zarar durumu profit2 de tutulur
		System.out.println("------------------------------------");
		System.out.print("Sonuc: ");
		if (profit1 > profit2) {				// stock1 ve stock2 nin kar/zarar durumu karsilastirilir
			System.out.println(storel + " daha yararlidir.");
		} else if (profit2 > profit1) {
			System.out.println(store2 + " daha yararlidir");
												// karsilastirma sonucuna gore dogru bilgi ekrana yazdirilir.
		} else { // profit1 == profit2
			System.out.println(storel + " ve " + store2 + " esittir.");
		}
		System.out.println("------------------------------------");
	}

	public static int makePurchases(Stock currentStock) {
		
		System.out.println();
		System.out.print("Kac kez satin alma yaptin: ");
		int numPurchases = Integer.parseInt(scanner.nextLine()); // satin alma sayimizi giriyoruz
		
		for (int i = 1; i <= numPurchases; i++) {

			System.out.print(i + ". alimda kac tane aldin: ");		// i. satin alimda kac tane hisse aldigini giriyoruz
			int numShares = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Birim fiyat nedir: ");				// satin alirkenki birim fiyati giriyoruz
			int pricePerShare = Integer.parseInt(scanner.nextLine());
			currentStock.purchase(numShares, pricePerShare);  //stock1 i hesaplamaya gonderiyoruz
			
			System.out.println();
		}
													// hesaplamadan gelen stock1 in toplam maliyeti, 
		System.out.print("Guncel birim fiyat: ");			// guncel birim fiyat alinir	
		int currentPrice = Integer.parseInt(scanner.nextLine());

		int profit = currentStock.getProfit(currentPrice); // hesaplamaya yollanir
			// hesaplamadan gelen kar/zarar durumu profit adli degiskende tutulur
		System.out.println("------------------------------------");
		System.out.println("Net kazanc/kayip: " + profit + "TL");  // kar/zarar durumu yazdirilir

		return profit;

	}

}
