package algorithm.test;

import java.util.Arrays;

public class Test20201203 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 5, 3, 1};

        arr = bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = quick(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = selectSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = heapSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = insertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        fibonacciFind(arr, 10);
    }

    /**
     * 交换排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] quick(int[] arr) {
        return quickSort(arr, 0 , arr.length - 1);
    }

    public static int[] quickSort(int[] arr, int lo, int high) {
        if (lo < high) {
            int index = partition(arr, lo, high);
            quickSort(arr, lo, index - 1);
            quickSort(arr, index + 1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int lo, int high) {
        int key = arr[lo];
        while (lo < high) {
            while (key <= arr[high] && lo < high)
                high--;
            arr[lo] = arr[high];

            while (key >= arr[lo] && lo < high)
                lo++;
            arr[high] = arr[lo];
        }
        arr[lo] = key;
        return lo;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return arr;
    }

    public static int[] heapSort(int[] arr) {
        int heapSize = arr.length - 1;
        // 初始化大顶堆
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeap(arr, i, heapSize);
        }

        // 调整大顶堆
        for (int i = heapSize; i > 0; i--) {
            if (arr[i] < arr[0]) {
                int tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;

                heapSize--;
                maxHeap(arr, 0, heapSize);
            }
        }
        return arr;
    }

    public static int[] maxHeap(int[] arr, int index, int heapSize) {
        int l = 2 * index + 1;
        int r = 2 * index + 2;

        int largeSize = index;
        if (l < heapSize && arr[largeSize] < arr[l])
            largeSize = l;
        if (r < heapSize && arr[largeSize] < arr[r])
            largeSize = r;
        if (largeSize != index) {
            int tmp = arr[index];
            arr[index] = arr[largeSize];
            arr[largeSize] = tmp;

            maxHeap(arr, largeSize, heapSize);
        }
        return arr;
    }

    /**
     * 插入排序
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        int len = arr.length;
        // 每次分组，步长
        for (int gap = len / 2; gap > 0; gap /= 2) {
            // 每次从步长索引位置遍历
            for (int i = gap; i < len; i++) {
                // 组内排序，只不过是各组交叉进行的，不是一组排完后再排另一组
                for (int j = i; j >= gap && arr[j] < arr[j - gap]; j -= gap) {
                    int tmp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = tmp;
                }
            }
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
        if (len < 2)
            return arr;

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
            if (left[li] > right[ri])
                res[resi++] = right[ri++];
            else
                res[resi++] = left[li++];
        }
        while (li < llen) {
            res[resi++] = left[li++];
        }
        while (ri < rlen) {
            res[resi++] = right[ri++];
        }

        return res;
    }

    /**
     * 查找
     * @param arr
     * @param key
     * @return
     */
    public static int find(int[] arr, int key) {
        if (arr.length == 0)
            return -2;
        int lo = 0;
        int high = arr.length - 1;
        while (lo <= high) {
            int mid = (lo + high) / 2;
            if (key < arr[mid])
                high = mid - 1;
            else if (key > arr[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int fibonacciFind(int[] arr, int key) {
        if (arr.length == 0)
            return -2;

        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        int k = 0;
        int[] fi = fibonacci(100);
        while (arr.length > fi[k] - 1)
            k++;
        int[] tmp = Arrays.copyOf(arr, fi[k]);
        for (int i = arr.length; i < fi[k]; i++) {
            tmp[i] = arr[arr.length - 1];
        }
        while (lo <= hi) {
            mid = lo + fi[k - 1] - 1;
            if (key < tmp[mid]) {
                hi = mid - 1;
                k--;    // 控制 mid 中的 k
            } else if (key > tmp[mid]) {
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
}
