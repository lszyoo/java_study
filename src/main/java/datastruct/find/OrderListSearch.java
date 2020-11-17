package datastruct.find;

import java.util.Arrays;

public class OrderListSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7};
        System.out.println(binarySearch(arr, 0));
        System.out.println(interpolationSearch(arr, 7));
        System.out.println(fibonacciSearch(arr, 7));
        System.out.println(5/2);
    }

    /**
     * 折半查找（二分查找）
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -2;      // 如果未找到则返回状态码：-2
    }

    /**
     * 插值查找
     * @param arr
     * @param key
     * @return
     */
    public static int interpolationSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -2;
    }

    /**
     * 斐波那契数列：
     *             0 1 2 3 4 5 6 7 8 ...
     *             0 1 1 2 3 5 8 13 21 ...
     * 性质：前一个数除以相邻的后一个数，比值无限接近黄金分割 0.618
     * @param arr
     * @param key
     * @return
     */
    private static int fibonacciSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        int k = 0;
        // 获取斐波那契数列
        int[] fibonacci = fibonacci(100);
        // 计算 arr.length 位于斐波那契数列的位置，-1 是为了防止斐波那契数列越界
        while (arr.length > fibonacci[k] - 1) {
            k++;
        }

        // 生成新数组
        int[] tmp = Arrays.copyOf(arr, fibonacci[k]);

        // 将不满的数值补全
        for (int i = arr.length; i < fibonacci[k]; i++) {
            tmp[i] = arr[arr.length - 1];
        }

        while (low <= high) {
            // 由于前面部分有f[k-1]个元素
            mid = low + fibonacci[k - 1] - 1;
            if (key < arr[mid]) {       // 关键字小于切割位置元素 继续在前部分查找
                high = mid - 1;
                /* 全部元素=前部元素+后部元素
                 * f[k]=f[k-1]+f[k-2]
                 * 因为前部有f[k-1]个元素,所以可以继续拆分f[k-1]=f[k-2]+f[k-3]
                 * 即在f[k-1]的前部继续查找 所以k--
                 * 即下次循环 mid=f[k-1-1]-1
                 */
                k--;
            } else if (key > arr[mid]) {        // 关键字大于切个位置元素 则查找后半部分
                low = mid + 1;
                /* 全部元素=前部元素+后部元素
                 * f[k]=f[k-1]+f[k-2]
                 * 因为后部有f[k-2]个元素,所以可以继续拆分f[k-2]=f[k-3]+f[k-4]
                 * 即在f[k-2]的前部继续查找 所以k-=2
                 * 即下次循环 mid=f[k-1-2]-1
                 */
                k -= 2;
            } else {
                if (mid <= arr.length - 1) {
                    return mid;
                } else {
                    return arr.length - 1;      // 可能产生数组越界
                }
            }
        }
        return -2;
    }

    /**
     * 斐波那契数列
     * @param n 数列长度
     * @return
     */
    private static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i ++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}


