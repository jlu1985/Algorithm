package org.myorg.sorting;

/**
 * <p>
 * In computer science, counting sort is an algorithm for sorting a collection
 * of objects according to keys that are small integers; that is, it is an
 * integer sorting algorithm. It operates by counting the number of objects that
 * have each distinct key value, and using arithmetic on those counts to
 * determine the positions of each key value in the output sequence. Its running
 * time is linear in the number of items and the difference between the maximum
 * and minimum key values, so it is only suitable for direct use in situations
 * where the variation in keys is not significantly greater than the number of
 * items. However, it is often used as a subroutine in another sorting
 * algorithm, radix sort, that can handle larger keys more efficiently.Because
 * counting sort uses key values as indexes into an array, it is not a
 * comparison sort, and the O(n log n) lower bound for comparison sorting does
 * not apply to it. Bucket sort may be used for many of the same tasks as
 * counting sort, with a similar time analysis; however, compared to counting
 * sort, bucket sort requires linked lists, dynamic arrays or a large amount of
 * preallocated memory to hold the sets of items within each bucket, whereas
 * counting sort instead stores a single number (the count of items) per bucket.
 * </p>
 * 
 * @author Jia Lu
 * @see <a href="http://en.wikipedia.org/wiki/Counting_sort">Counting Sort -
 *      Wikipedia</a>
 */
public class CountingSort {

    public void sort(int[] list) {
        int[] source = list.clone();
        int[] output = list;
        int max = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] > max) {
                max = source[i];
            }
        }

        max = (max < source.length) ? source.length : max + 1;
        int[] count = new int[max];

        for (int i = 0; i < source.length; i++) {
            count[source[i]] = count[source[i]] + 1;
        }
        for (int i = 1; i <= count.length - 1; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = source.length - 1; i >= 0; i--) {
            // zero base index, all minus one
            output[count[source[i]] - 1] = source[i];
            count[source[i]] = count[source[i]] - 1;
        }
    }

}
