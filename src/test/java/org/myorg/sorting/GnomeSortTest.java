package org.myorg.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class GnomeSortTest {

    private int[] input = { 1, 3, 4, 2, 97, 5, 2, 63, 2, 9, 1 };
    private int[] output = { 1, 1, 2, 2, 2, 3, 4, 5, 9, 63, 97 };
    private GnomeSort gnomeSort;

    @Before
    public void init() {
        gnomeSort = new GnomeSort();
    }

    @Test
    public void test() {
        gnomeSort.sort(input);
        assertTrue(Arrays.equals(input, output));
    }

}
