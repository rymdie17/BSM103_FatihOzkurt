package searchAlgorithms;

public class BasicSearch2 {

	public static void main(String[] args) {
		// Sirali bir dizimiz var
		int[] numbers = {11, 18, 29, 37, 42, 49, 51, 63};
		
		int index = indexOf(numbers, 5);	
		
		if (index == -1) {
			System.out.println("Eleman bulunamadi");
		} else {
			System.out.println("Elemanin indexi: " + index);
		}
	}
	
	// Birazcik daha hizli
	public static int indexOf(int[] numbers, int target) {
		
		int i = 0;
		
		while (i < numbers.length && numbers[i] <= target) {
			if(numbers[i] == target) {
				return i;
			} else {
				i++;
			}
		}
		
		return -1;
	}

}
