package stockExample;

public class Stock {

	private String store;
	private int totalProduct;
	private int totalCost;

	public Stock(String thestore) { // Stock sinifinin ozeliikleri
		if (thestore.equals("")) { // Eger magaza ismi bossa bos isaretcisi hatasini ver
			throw new NullPointerException();
		}
		this.store = thestore; // store ozelligini constructordan gelen thestore a esitle
		this.totalProduct = 0; // totalProduct ve totalCost un ilk degerlerini belirle
		this.totalCost = 0;
	}

	public int getProfit(int currentPrice) {
		if (currentPrice < 0) {
			throw new IllegalArgumentException();

		}

		int marketValue = totalProduct * currentPrice; // guncel birim fiyat ile satin alinan hisse sayisi carpilir
		return marketValue - totalCost;		// guncel degerden toplam maliyet cikarilarak kar zarar hesabi yapilir.

	}

	public void purchase(int shares, int pricePerShare) {
		if (shares < 0 || pricePerShare < 0) {
			throw new IllegalArgumentException();
		}

		totalProduct += shares;	// baslangic degeri 0 olan toplam urun sayisina kullanici verisini ekliyoruz.
		totalCost += shares * pricePerShare; // toplam maliyet hesaplanir

	}
}
