package sort;

import java.util.Arrays;

/**
 * Arrays.sort()采用了一种名为TimSort的排序算法，就是归并排序的优化版本。
 *
 * 归并排序基本思想：
 *      将待排序的数列分成若干个长度为1的子数列，然后将这些数列两两合并并排序；得到若干个长度为2的有序数列，
 *      再将这些数列两两合并并排序；得到若干个长度为4的有序数列，再将它们两两合并；直接合并成一个数列为止。
 *      这样就得到了我们想要的排序结果。
 *
 * 平均时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 归并排序是稳定的。
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = mergeSort(new int[]{5, 2, 6, 1, 9});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // 采用分治(Divide and Conquer)的一个非常典型的应用。将已有序的子序列合并，得到完全的序列
    public static int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, len / 2);
        int[] right = Arrays.copyOfRange(arr, len / 2, len);
        // 递归，将数组分裂，直到分裂成单个元素为止
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int llen = left.length;
        int rlen = right.length;
        // 申请空间，长度为两个已经排好序的数组的长度之和
        int[] res = new int[llen + rlen];
        int li = 0, ri = 0, resi = 0;
        // 遍历两个排好序的数组，resi、ri、li都在增加
        // 若 llen > li && rlen > ri 其中一个不满足，则跳出执行下边两个while
        while (llen > li && rlen > ri) {
            if (left[li] < right[ri]) {
                res[resi++] = left[li++];
            } else {
                res[resi++] = right[ri++];
            }
        }
        // 若 rlen < ri 则执行
        while (llen > li) {
            res[resi++] = left[li++];
        }
        // 若 llen < li 则执行
        while (rlen > ri) {
            res[resi++] = right[ri++];
        }
        return res;
    }
}
