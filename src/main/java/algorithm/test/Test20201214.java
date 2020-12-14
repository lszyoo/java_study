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


}
