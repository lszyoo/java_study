package sort;

/**
 * 希尔排序严格来说是基于插入排序的思想，又被称为缩小增量排序。
 *
 * 　　具体流程如下：
 *
 * 　　1、将包含n个元素的数组，分成n/2个数组序列，第一个数据和第n/2+1个数据为一对...
 *
 * 　　2、对每对数据进行比较和交换，排好顺序；
 *
 * 　　3、然后分成n/4个数组序列，再次排序；
 *
 * 　　4、不断重复以上过程，随着序列减少并直至为1，排序完成。
 *
 * 举例：
 *      现在我们有一个数组，该数组有6个元素
 *          int[] arrays = {2, 5, 1, 3, 4, 6};
 *      排序前：
 *          将该数组看成三个（arrays.length/2)数组，分别是:{2,3},{5,4},{1,6}
 *      第一趟排序：
 *          对三个数组分别进行插入排序，因此我们三个数组得到的结果为{2,3},{4,5},{1,6}
 *          此时数组是这样子的：{2, 4, 1, 3, 5, 6}
 *      第二趟排序：
 *          增量减少了，上面增量是3，此时增量应该为1了，因此把{2, 4, 1, 3, 5, 6}看成一个数组(从宏观上是有序的了)，对其进行插入排序，直至有序
 *
 *  平均时间复杂度：O(n^1.3)
 *  空间复杂度：O(1)的额外空间，
 *  希尔排序是不稳定的。
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = shellSort(new int[]{3, 5, 9, 2, 1, 10, 4});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 从小到大排序
     * 以下运行过程：
     *          /2  -- [3, 5, 9, 2, 1, 10, 4]
     *                 [2, 5, 9, 3, 1, 10, 4]
     *                 [2, 1, 9, 3, 5, 10, 4]
     *          /4  -- [1, 2, 9, 3, 5, 10, 4]
     *                 [1, 2, 3, 9, 5, 10, 4]
     *                 [1, 2, 3, 5, 9, 10, 4]
     *                 [1, 2, 3, 4, 5, 9, 10]
     *
     * 说明：希尔排序只是分组，第一次并不直接改变元素在arr中的位置
     */
    public static int[] shellSort(int[] arr) {
        int j;
        // 将数组中的元素分组，增量每次都 /2
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从增量那组开始进行插入排序，直至完毕
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                // j - gap 就是代表与它同组隔壁的元素，此处融合了插入排序的 if 判断句
                for (j = i; j >= gap && tmp < arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
        return arr;
    }

}