package sortAlgorithms;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }

        System.out.print("Before: ");
        print(array);

        bubbleSot(array);

        System.out.print("After: ");
        print(array);
    }

    private static void bubbleSot(int[] array) {

        boolean isNotSorted = true; // while icine girmesi icin true yaptik en basta
        while (isNotSorted) {
            isNotSorted = false;    // eger dizide hicbir sey yerinden oynamamissa o zaman siralidir demek ki
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isNotSorted = true;
                    // if in icine girdigimize gore dizide bir sey yerinden oynadi
                    // demekki hala sirali degil
                    // bu yuzden bir daha donmesi icin true ya esitliyoruz
                }
            }
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
