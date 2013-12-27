package org.myorg.sorting;

/**
 * Optimized Gnome Sort, Insertion Sort variant
 * 
 * @author Jia Lu
 */
public class GnomeSort {
    public void sort(int[] list) {

        int pos = 1;
        int last = 0;
        int temp = 0;

        while (pos < list.length) {
            if (list[pos] >= list[pos - 1]) {
                if (last != 0) {
                    pos = last;
                    last = 0;
                }
                pos++;
            } else {
                temp = list[pos];
                list[pos] = list[pos - 1];
                list[pos - 1] = temp;

                if (pos > 1) {
                    if (last == 0) {
                        last = pos;
                    }
                    pos--;
                } else {
                    pos++;
                }
            }
        }
    }
}