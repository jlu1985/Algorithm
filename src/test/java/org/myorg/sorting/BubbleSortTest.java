package org.myorg.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort;
    private int[] input = { 1, 3, 4, 2, 5, 2, 2, 9, 1 };
    private int[] output = { 1, 1, 2, 2, 2, 3, 4, 5, 9 };

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSort() {
        bubbleSort.sort(input);
        assertTrue(Arrays.equals(output, input));
    }

}
