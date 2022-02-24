package Metodlar;

import java.util.Arrays;
import java.util.Scanner;

//Metodları öğreniyorum 2:
//Kullanıcının belirlediği öğrenci sayısı kadar her öğrencinin vize ve final notunu alıp kanaat notu ekleyerek bunların yüzdeli ortalamasını aldıran program.

public class Fatih_OZKURT_uygulama2 { 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kaç öğrenci girilecek: ");
		int numberOfStudents = scanner.nextInt();
		
		if (numberOfStudents > 0) {
			
			System.out.println();
			
			double ortalama[] = new double[numberOfStudents];
			
			for (int sayac = 0; sayac < numberOfStudents; sayac++) {
				System.out.print(sayac+1 + ". Öğrencinin vize notunu giriniz: ");
				int vizeNotu = scanner.nextInt();
				
				System.out.print(sayac+1 + ". Öğrencinin final notunu giriniz: ");
				int finalNotu = scanner.nextInt();
				
				if (vizeNotu >= 0 && vizeNotu <= 100 && finalNotu >= 0 && finalNotu <= 100) {
					
					ortalama[sayac] = ortalamaHesap(vizeNotu, finalNotu);
					
					System.out.println(sayac+1 + ". öğrencinin vize notu: " + vizeNotuHesap(vizeNotu));
					System.out.println(sayac+1 + ". öğrencinin final notu: " + finalNotuHesap(finalNotu));
					
					System.out.println();
				}
				else {
					System.out.println("Öğrencinin Notunu [0,100] aralığında giriniz!");
					break;
				}
			}
			
			System.out.println("Tüm Öğrencilerin geçme puanı: " + Arrays.toString(ortalama));
		}
		else 
			System.out.println("Öğrenci sayısı 0' dan büyük olmalıdır.");
			
		
		
	}
	
	public static double ortalamaHesap(int vizeNotu, int finalNotu) {
		vizeNotu = (int) vizeNotuHesap(vizeNotu);
		finalNotu = (int) finalNotuHesap(finalNotu);
		
		double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
		return ortalama;
	}
	
	public static double vizeNotuHesap(int vizeNotu) {
		double not = 0.0;
		
		if (vizeNotu >= 80) {
			not = vizeNotu*1.10;
		}
		else if (vizeNotu >= 60) {
			not = vizeNotu*1.05;
		}
		else 
			not = vizeNotu;
		
		if (not > 100) {
			not = 100;
		}
		
		return not;
	}
	
	public static double finalNotuHesap(int finalNotu) {
	double not = 0.0;
		
		if (finalNotu >= 70) {
			not = finalNotu*1.10;
		}
		else if (finalNotu >= 40) {
			not = finalNotu*1.05;
		}
		else
			not = finalNotu;
		
		if (not > 100) {
			not = 100;
		}
		
		return not; 
	}

}
