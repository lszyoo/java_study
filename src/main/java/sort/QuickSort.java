package sort;

/**
 * 快速排序是冒泡排序的改进版，也是最好的一种内排序，利用了分治思想。
 *
 * 思想:
 *      1、在待排序的元素任取一个元素作为基准，称为基准元素；
 *      2、将待排序的元素进行分区，比基准元素大的元素放在它的右边，比其小的放在它的左边；
 *      3、对左右两个分区重复以上步骤直到所有元素都是有序的。
 *
 * 平均时间复杂度：O(nlogn)
 * 空间复杂度：O(nlogn)
 * 快速排序是不稳定的。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = quickSort(new int[]{5, 9, 2, 3, 10}, 0, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            // 以第一个元素为基准分出两部分
            int index = partition(arr, lo, hi);
            // 递归前半部分
            quickSort(arr, lo, index - 1);
            // 递归后半部分
            quickSort(arr, index + 1, hi);
        }
        return arr;
    }

    public static int partition(int[] arr, int lo, int hi) {
        // 固定切分方式，以第一个元素为基准
        int key = arr[lo];
        while (lo < hi) {
            // 从后半部分向前扫描，如果大于等于基准，则指针向左移动，否则赋值给 lo 下标处
            while (arr[hi] >= key && hi > lo) {

                hi--;
            }
            arr[lo] = arr[hi];
            // 从前半部分向后扫描，如果小于等于基准，则指针向右移动，否则赋值给 hi 下标处
            while (arr[lo] <= key && hi > lo) {
                lo++;
            }
            arr[hi] = arr[lo];
        }
        // 将基准放回数组，以下两种均可
        arr[hi] = key;
        return hi;
//        arr[lo] = key;
//        return lo;
    }
}
