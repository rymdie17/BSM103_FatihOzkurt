package sortAlgorithms;

public class MergeSort {

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Dizinin ilk hali:");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("Son hali:");
		printArray(arr);
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Orta noktayi bulma
			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}

		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Kalan elemanlar kopyalanir
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] input) {
        	System.out.print("[" + input[0]);
        	for (int x = 1; x < input.length; x++) {
           	 	System.out.print(", " + input[x]);
        	}
        System.out.println("]");

    }
}
