package evdeDeneyinHomework;

import java.util.Scanner;

public class TelegramYanyan {
	public static final int N = 3;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yan yana kaç kere olsun: ");
		int yanyana = 2*scanner.nextInt()-1;
		
		for (int satir = N; satir > 0; satir--) {
			
			for (int bosluk = 0; bosluk < N-satir; bosluk++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int yan = 0; yan < yanyana; yan++) {
				if (yan % 2 == 0) {
					for (int bosluk = 0; bosluk < 2*satir-1; bosluk++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}else {
					for (int bosluk = 0; bosluk < 2*(N-satir)+1  ; bosluk++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}		
			} 
			System.out.println();
		}	
	}
}
