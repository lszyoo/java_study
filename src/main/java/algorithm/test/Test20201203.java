package algorithm.test;

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

    }
}
