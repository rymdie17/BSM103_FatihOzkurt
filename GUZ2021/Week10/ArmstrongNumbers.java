package evdeDeneyinHomework;
import java.util.Scanner;
public class ArmstrongNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nereden başlasın: ");
		int start = scanner.nextInt();//başlangıç değerini al
						//(aynı zamanda ilk denenecek sayı ve bundan sonraki denenecek tüm sayıların ismi start olacaktır)
		System.out.print("Nerede bitsin: ");		//bitiş değerini al
		int finish = scanner.nextInt();
		
		while (start <= finish) {						//başlangıç değeri bitiş değerinden küçük ve eşitken
			
			char[] digits = String.valueOf(start).toCharArray(); 
			//System.out.println(digits.length);    //dizinin eleman sayısı sayının basamak sayısına eşit olacaktır.
												//sayının string değerinin digits isimli char dizisini oluştur
			int result = 0;						//result(sonuç) isimli değişken oluştur değeri 0 olsun
			for(int counter = 0; counter < digits.length; counter++) { 		//sayının basamak sayısı kere döndür 
				result += (int)Math.pow(Character.getNumericValue(digits[counter]), digits.length);
			}	//	bir char dizisi olacağı için sayı karakterleri ascii olarak kodlanacaktır.
			 	//	bunları sayısal veri olarak kullanmak için bu şekilde bir dönüşüm yapılıyor.
				//  (sayının basamak sayısı kere) dizinin elemanları(sayının her bir basamağı) üssü sayının basamak sayısı al 
				//  ve bunları her seferinde topla ve sonuca eşitle
			
			if(result == start) {			//eğer sonuç start a eşitse
				System.out.println(start + " bir Armstrong sayıdır." );		//bu sayı(start) bir armstrong sayıdır.
			}
			
			start++;  //start ı 1 arttır.
		}//closeWhile
	}//closeMain
}//closeClass
