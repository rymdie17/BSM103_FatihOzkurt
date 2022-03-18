package stockExample;

import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("İlk mağaza ismi: ");
		String storel = scanner.nextLine();
		Stock stock1 = new Stock(storel);
		int profit1 = makePurchases(stock1);
		
		System.out.println("------------------------------------");
		
		System.out.print("İkinci mağaza ismi: ");
		String store2 = scanner.nextLine();
		Stock stock2 = new Stock(store2);
		int profit2 = makePurchases(stock2);
		
		System.out.println("------------------------------------");
		System.out.print("Sonuç: ");
		if (profit1 > profit2) {
			System.out.println(storel + " daha yararlıdır.");
		} else if (profit2 > profit1) {
			System.out.println(store2 + " daha yararlıdır");

		} else { // profit1 == profit2
			System.out.println(storel + " ve " + store2 + " eşittir.");
		}
		System.out.println("------------------------------------");
	}

	public static int makePurchases(Stock currentStock) {
		
		System.out.println();
		System.out.print("Kaç kez satın alma yaptın: ");
		int numPurchases = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= numPurchases; i++) {

			System.out.print(i + ". alımda kaç tane aldın: ");
			int numShares = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Birim fiyat nedir: ");
			int pricePerShare = Integer.parseInt(scanner.nextLine());
			currentStock.purchase(numShares, pricePerShare);
			
			System.out.println();
		}
		
		System.out.print("Guncel birim fiyat: ");
		int currentPrice = Integer.parseInt(scanner.nextLine());

		int profit = currentStock.getProfit(currentPrice);
		System.out.println("------------------------------------");
		System.out.println("Net kazanc/kayıp: " + profit + "TL");

		return profit;

	}

}
