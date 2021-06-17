package data.structures.and.algos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortSolutionTest {
    @Test
    void whenGivenEmptyList_MergeSortShouldReturnEmptyList() {
        int[] array = new int[0];
        MergeSortSolution.mergeSort(array);
        assertTrue(array.length == 0);
    }

    @Test
    void whenGivenListWithOneElement_shouldReturnUnchangedList() {
        int[] array = new int[0];
        array[0] = 20;
        int[] sortedArray = MergeSortSolution.mergeSort(array);
        assertEquals(1, array.length);
        assertEquals(sortedArray, array);
    }

    @Test
    void whenUnsortedListIsUsedAsAParam_shouldReturnSortedList() {
        int[] array = new int[7];
        array[0] = 9;
        array[1] = 5;
        array[2] = 2;
        array[3] = 7;
        array[4] = 4;
        array[5] = 3;
        array[6] = 1;
        MergeSortSolution.mergeSort(array);
        int[] expected = new int[7];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
        expected[5] = 7;
        expected[6] = 9;
        assertEquals(expected[0], array[0]);
        assertEquals(expected[1], array[1]);
        assertEquals(expected[2], array[2]);
        assertEquals(expected[3], array[3]);
        assertEquals(expected[4], array[4]);
        assertEquals(expected[5], array[5]);
        assertEquals(expected[6], array[6]);
    }
}
