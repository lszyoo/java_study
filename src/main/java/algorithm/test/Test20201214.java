package algorithm.test;

import java.util.Arrays;

public class Test20201214 {
    public static void main(String[] args) {

    }

    /**
     * 查找
     * @param arr
     * @param key
     * @return
     */
    public static int binaryFind(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        int hi = arr.length - 1;
        int lo = 0;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (arr[mid] > key)
                hi = mid - 1;
            else if (arr[mid] < key)
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int fibonacciFind(int[] arr, int key) {
        if (arr.length == 0)
            return -1;

        int k = 0;
        int[] fibonacci = fibonacci(100);
        while (arr.length > fibonacci[k] - 1)
            k++;
        int[] tmp = Arrays.copyOf(arr, fibonacci[k]);
        for (int i = arr.length; i < tmp.length; i++) {
            tmp[i] = arr[arr.length - 1];
        }

        int hi = arr.length - 1;
        int lo = 0;
        while (lo <= hi) {
            int mid = lo + fibonacci[k - 1] - 1;
            if (tmp[mid] > key) {
                hi = mid - 1;
                k--;
            } else if (tmp[mid] < key) {
                lo = mid + 1;
                k -= 2;
            } else {
                if (mid < arr.length - 1)
                    return mid;
                else
                    return arr.length - 1;
            }
        }
        return -1;
    }

    public static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    /**
     * 交换排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] quick(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    public static int[] quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int index = partition(arr, lo, hi);
            quickSort(arr, lo, index - 1);
            quickSort(arr, index + 1, hi);
        }
        return arr;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int key = arr[lo];
        while (lo < hi) {
            while (key <= arr[hi] && lo < hi)
                hi--;
            arr[lo] = arr[hi];
            while (key >= arr[lo] && lo < hi)
                lo++;
            arr[hi] = arr[lo];
        }
        arr[lo] = key;
        return lo;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return arr;
    }

    public static int[] heapSort(int[] arr) {
        int heapSize = arr.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeap(arr, heapSize, i);
        }
        for (int i = heapSize; i > 0; i--) {
            if (arr[i] < arr[0]) {
                int tmp = arr[i];
                arr[i] = arr[0];
                arr[0] = tmp;

                heapSize--;
                maxHeap(arr, heapSize, 0);
            }
        }
        return arr;
    }

    public static int[] maxHeap(int[] arr, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int large = index;

        if (left < heapSize && arr[left] > arr[large])
            large = left;
        if (right < heapSize && arr[right] > arr[large])
            large = right;
        if (large != index) {
            int tmp = arr[large];
            arr[large] = arr[index];
            arr[index] = tmp;

            maxHeap(arr, heapSize, large);
        }
        return arr;
    }

    /**
     * 归并排序
     * @param arr
     * @return
     */
    public static int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, len / 2);
        int[] right = Arrays.copyOfRange(arr, len / 2, len);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int llen = left.length;
        int rlen = right.length;
        int[] res = new int[llen + rlen];

        int li = 0, ri = 0, resi = 0;
        while (li < llen && ri < rlen) {
            if (left[li] < right[ri]) {
                res[resi++] = left[li++];
            } else  {
                res[resi++] = right[ri++];
            }
        }
        while (li < llen) {
            res[resi++] = left[li++];
        }
        while (ri < rlen) {
            res[resi++] = right[ri++];
        }
        return res;
    }
}
