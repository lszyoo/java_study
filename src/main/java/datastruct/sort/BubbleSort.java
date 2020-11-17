package datastruct.sort;

/**
 * 冒泡排序是一种交换排序，其基本思想是：
 * 对相邻的元素进行两两比较，顺序相反则进行交换，这样，每一趟会将最小或最大的元素“浮”到顶端，最终达到完全有序。
 *
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 冒泡排序是稳定的。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = bubbleSort(new int[]{4, 7, 5, 3, 1});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 从小到大排序
     *
     * i = 0, j = 0, j < arr.length, if (arr[j] > arr[j + 1])中 arr[j + 1]可取到数组末端
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 数组最右端的 i 个值已经排好序
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 两两交换
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}