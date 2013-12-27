package org.myorg.sorting;

/**
 * 
 * @author Jia Lu
 * 
 */
public class InsertionSort {
    public void sort(int[] list) {
        int valueToInsert;
        int holePos;
        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePos = i;
            while (holePos > 0 && (valueToInsert < list[holePos - 1])) {
                list[holePos] = list[holePos - 1];
                holePos = holePos - 1;
            }
            list[holePos] = valueToInsert;
        }
    }
}
