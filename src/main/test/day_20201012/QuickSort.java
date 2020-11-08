package day_20201012;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = quicksort(new int[]{5, 9, 2, 3, 10, 1, 6, 14, 11}, 0, 8);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        arr = bubblesort(new int[]{5, 9, 2, 3, 10});
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(step(5));
    }

    public static int[] quicksort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int index = partition(arr, lo, hi);
            quicksort(arr, index + 1, hi);
            quicksort(arr, lo, index - 1);
        }
        return arr;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int key = arr[lo];
        while (hi > lo) {
            while (arr[hi] >= key && hi > lo)
                hi--;
            arr[lo] = arr[hi];
            while (arr[lo] <= key && hi > lo)
                lo++;
            arr[hi] = arr[lo];
        }
        arr[hi] = key;
        return hi;
    }

    public static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static int step(int m) {
        if (m <= 0)
            return 0;
        else if (m == 1)
            return 1;
        else if (m == 2)
            return 2;
        else if (m == 3)
            return 4;
        else
            return step(m - 1) + step(m - 2) + step(m - 3);
    }
}
