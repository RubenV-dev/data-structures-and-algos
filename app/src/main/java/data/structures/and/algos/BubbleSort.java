package data.structures.and.algos;

public class BubbleSort {
    public static void bubbleSort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i+1);
                    isSorted = false;
                }
            }
        }
    }

    public static void swap(int[] array,  int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
