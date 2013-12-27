package org.myorg.sorting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;

public class CountingSortTest {
	private CountingSort countingSort;
	private int[] input ={1,3,4,2,5,2,532,2,9,1,8,2};
	private int[] output = {1,1,2,2,2,2,3,4,5,8,9,532};
	
	@Before
	public void init(){
		countingSort = new CountingSort();
	}
	@Test
	public void test() {
		countingSort.sort(input);
		assertTrue(Arrays.equals(output,input));
	}

}
