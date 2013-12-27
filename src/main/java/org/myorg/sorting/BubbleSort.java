package org.myorg.sorting;

/**
 * 
 * <p>
 * <b>Bubble sort</b>, sometimes incorrectly referred to as sinking sort, is a
 * simple sorting algorithm that works by repeatedly stepping through the list
 * to be sorted, comparing each pair of adjacent items and swapping them if they
 * are in the wrong order. The pass through the list is repeated until no swaps
 * are needed, which indicates that the list is sorted. The algorithm gets its
 * name from the way smaller elements "bubble" to the top of the list. Because
 * it only uses comparisons to operate on elements, it is a comparison sort.
 * Although the algorithm is simple, most of the other sorting algorithms are
 * more efficient for large lists.
 * </p>
 * <p>
 * <b>Performance</b>: Bubble sort has worst-case and average complexity both
 * O(n<sup>2</sup>), where n is the number of items being sorted. There exist
 * many sorting algorithms with substantially better worst-case or average
 * complexity of O(n log n). Even other O(n<sup>2</sup>) sorting algorithms,
 * such as insertion sort, tend to have better performance than bubble sort.
 * Therefore, bubble sort is not a practical sorting algorithm when n is large.
 * </p>
 * 
 * @author Jia Lu
 * @see <a href="http://en.wikipedia.org/wiki/Bubble_sort">Wiki</a>
 * 
 * 
 */
public class BubbleSort {
    public void sort(int[] list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < list.length; i++) {
                if (list[i - 1] > list[i]) {
                    swap(list, i - 1, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private void swap(int[] list, int leftIndex, int rightIndex) {
        int tempValue = list[leftIndex];
        list[leftIndex] = list[rightIndex];
        list[rightIndex] = tempValue;
    }
}
