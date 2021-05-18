package data.structures.and.algos;


import java.util.List;

import static java.util.Collections.swap;

public class QuickSort {
    public static List<Integer> quickSort(List<Integer> integerList) {
        if(integerList.size() <= 1){
            return integerList;
        }
        quickSort(integerList, 0, integerList.size() - 1);
        System.out.println(integerList);
        return integerList;
    }

    public static void quickSort(List<Integer> integerList, int left, int right){
        //Do a quick bound check
        if(left >= right) {
            return;
        }
        int pivot = integerList.get((left + right) / 2);
        int index = partition(integerList, left, right, pivot);
        quickSort(integerList, left, index - 1);
        quickSort(integerList, index, right);
    }

    public static int partition(List<Integer> integerList, int left, int right, int pivot){
        while (left <= right) {
            while(integerList.get(left) < pivot) {
                left++;
            }
            while(integerList.get(right) > pivot) {
                right--;
            }
            if(left <= right){
                swap(integerList, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}
