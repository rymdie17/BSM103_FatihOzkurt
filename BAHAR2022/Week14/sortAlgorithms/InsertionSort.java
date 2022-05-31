package sortAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7,3,1,2,4,6};
        insertionSort(array);
        print(array);

    }

    private static void insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int value = input[i];
            int j = i;
            while (j > 0 && input[j-1] > value) {
                input[j] = input[j - 1];
                j--;
            }
            input[j] = value;
        }
    }

    private static void print(int[] input) {
        System.out.print("[" + input[0]);
        for (int x = 1; x < input.length; x++) {
            System.out.print(", " + input[x]);
        }
        System.out.println("]");

    }
}