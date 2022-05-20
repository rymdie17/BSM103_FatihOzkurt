package searchAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
		// Sirali bir dizimiz var
		int[] numbers = {11, 18, 29, 37, 42, 49, 51, 63};
		
		int index = binarySearch(numbers, 29	);	
		
		if (index == -1) {
			System.out.println("Eleman bulunamadi");
		} else {
			System.out.println("Elemanin indexi: " + index);
		}
	}
	
	// Cok hizli
	public static int binarySearch(int[] numbers, int target) {
		int min = 0;
		int max = numbers.length - 1;
		
		while(min <= max) {
			int mid = (min + max) / 2;
			if (numbers[mid] < target) {
				min = mid + 1;
			} else if(numbers[mid] > target) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	// Recursive li olan
	public static int binarySearch(int[] numbers, int target, int min, int max) {
		if(min > max) {
			return -1;
		} else {
			int mid = (min + max) / 2;
			if (numbers[mid] < target) {
				return binarySearch(numbers, target, mid + 1, max);
			} else if(numbers[mid] > target) {
				return binarySearch(numbers, target, min, mid - 1);
			} else {
				return mid;
			}
		}
	}
}
