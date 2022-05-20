package searchAlgorithms;

public class BasicSearch {

	public static void main(String[] args) {
		// Dizimiz sirali degil !
		int[] numbers = {63, 18, 51, 37, 29, 49, 42, 11};
		
		int index = indexOf(numbers, 31);	
		
		if (index == -1) {
			System.out.println("Eleman bulunamadi");
		} else {
			System.out.println("Elemanin indexi: " + index);
		}
	}
	
	// En yavasi
	public static int indexOf(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
}
