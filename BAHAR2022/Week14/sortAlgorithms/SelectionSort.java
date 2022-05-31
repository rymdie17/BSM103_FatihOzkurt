package sortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7,3,1,2,4,6};
        selectionSort(array);
        print(array);
    }

    private static void selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = i; // minimum indexi tutma
            for (int j = i + 1; j < input.length; j++) {
                if (input[min] > input[j]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
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
