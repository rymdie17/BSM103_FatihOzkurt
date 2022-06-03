package functionalProgramming;

import java.util.Scanner;
import java.util.stream.IntStream;

/* Kullanicidan bir n tamsayi degeri isteyen ve ilk n asal sayinin toplamini bildiren,
   Kullanici 1 den kucuk bir deger girerse toplamini 0 bildiren bir program yaziniz. 	*/

/* Programinizi, 1, 2, 3, ... dizisini olusturmak icin yineleme islevi kullanin ve
   zamanlama koduyla ilk n asal sayinin toplamini hesaplamanin ne kadar surdugunu yazdirin */


public class SumPrimes {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Kac tane asal sayi toplamak istiyorsunuz: ");
		
		int a = console.nextInt();
		System.out.println(sumPrimes(a));
	}
	
	public static int sumPrimes(int count) {
		if(count <= 0) {
			return 0;
		} else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n+2)
					.filter(SumPrimes::isPrime2)
					.limit(count - 1)
					.sum() + 2;
			double elapsed = (System.currentTimeMillis() - start) / 1000;
			System.out.println(elapsed);
			return sum;
		}
		
	}
	
	public static boolean isPrime(int n) {
		return IntStream.range(1, n+1).filter(x -> n%x == 0).count() == 2;
	}
	
	public static boolean isPrime2(int n) {
		if(n == 1) {
			return false;
		} else {
			int root = (int) Math.sqrt(n);
			return IntStream.range(1, root+1)
					.filter(x -> n%x == 0)
					.count() == 1;
		}
	}

}
