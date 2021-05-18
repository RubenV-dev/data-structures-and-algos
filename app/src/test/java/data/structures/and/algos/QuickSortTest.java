package data.structures.and.algos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuickSortTest {

    @Test
    void whenGivenEmptyList_QuickSortShouldReturnEmptyList() {
        List<Integer> list = new ArrayList<>();
        QuickSort.quickSort(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void whenGivenListWithOneElement_shouldReturnUnchangedList() {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        List<Integer> sortedList = QuickSort.quickSort(list);
        assertEquals(1, list.size());
        assertEquals(sortedList, list);
    }

    @Test
    void whenUnsortedListIsUsedAsAParam_shouldReturnSortedList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(9,5,2,7,4,3,1));
        QuickSort.quickSort(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,9));
        assertEquals(expected, list);
    }

}
