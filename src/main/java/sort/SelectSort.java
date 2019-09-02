package sort;

/**
 * 选择排序是一种简单直观的排序算法，其基本原理如下：
 * 对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录的位置与第一个记录的位置交换；
 * 接着对不包括第一个记录以外的其他记录进行第二次比较，得到最小记录并与第二个位置记录交换；
 * 重复该过程，直到进行比较的记录只剩下一个为止。
 *
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 *
 * 选择排序是不稳定的。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = selectSort(new int[]{4, 5, 2, 8, 5, 1});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // 从小到大排序
    public static int[] selectSort(int[] arr) {
        int min = 0;
        // 遍历 arr
        for (int i = 0; i < arr.length; i++) {
            // 遍历 i 之后的元素
            for (int j = i + 1; j < arr.length; j++) {
                // 对于 i 元素位置，如果 i 之后有比之小的就做交换，即每次找到最小的，放到前边
                min = arr[i];
                if (arr[j] < min) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        return arr;
    }
}
