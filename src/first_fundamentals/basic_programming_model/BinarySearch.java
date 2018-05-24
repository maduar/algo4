package first_fundamentals.basic_programming_model;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 6;
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("key = " + key);
        System.out.println("arr = " + Arrays.toString(a));
        System.out.println("index: " + rank(key, a));
    }

}
