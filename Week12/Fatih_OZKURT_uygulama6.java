package Metodlar;

import java.util.Arrays;

//Metodları öğreniyorum 6:
//Dizilerin global değişken olduğunu her metot altında çağrılabileceğini ispatlayan garip bir program.

public class Fatih_OZKURT_uygulama6 {

	public static void main(String[] args) {
		
		int x = 0; 
		
		int[] arr = new int [4];

		x = x + 1;
		mystery(x, arr);
		System.out.println(x + " " + Arrays.toString(arr));

		x = x + 1; 
		mystery(x, arr);
		System.out.println(x + " " + Arrays.toString(arr)); 
	}
	public static void mystery(int x, int[] arr) {
		x = x + 1; 
		arr[x] = arr[x] + 1; 
		System.out.println(x + " " + Arrays.toString(arr));
	}

}
