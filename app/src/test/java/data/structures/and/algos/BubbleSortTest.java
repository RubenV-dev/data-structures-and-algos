package data.structures.and.algos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    @Test
    void whenGivenEmptyList_BubbleSortShouldReturnEmptyList() {
        int[] list = new int[0];
        BubbleSort.bubbleSort(list);
        assertEquals(0, list.length);
    }

    @Test
    void whenGivenListWithOneElement_shouldReturnUnchangedList() {
        int[] list = new int[1];
        list[0] = 1;
        BubbleSort.bubbleSort(list);
        assertEquals(1, list.length);
        assertEquals(1, list[0]);
    }

    @Test
    void whenUnsortedListIsUsedAsAParam_shouldReturnSortedList() {
        int[] actual = { 4,5,1,3,2,8,0 };
        int[] expected = { 0,1,2,3,4,5,8 };
        BubbleSort.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }

}
