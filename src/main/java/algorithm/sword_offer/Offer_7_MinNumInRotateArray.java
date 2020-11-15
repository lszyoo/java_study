package algorithm.sword_offer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *
 * 问题：
 *      输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *      例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1。
 *
 * NOTE：给出的所有元素都大于 0，若数组大小为 0，请返回 0
 *
 * 二分查找法：时间复杂度 O(logn)
 */
public class Offer_7_MinNumInRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 1};
        System.out.println(minNumInRotateArray(arr));
        // 输出：1
    }

    public static int minNumInRotateArray(int[] arr) {
        int len = arr.length;

        if (len == 0) {
            return 0;
        }

        int low = 0;
        int high = len - 1;
        int mid = 0;
        // 当最左边值大于等于最右边时候
        while (arr[low] >= arr[high]) {
            // 如果此时数组只剩下两个数值
            if (high - low == 1) {
                // 最小的就是右边
                mid = high;
                break;
            }
            // 如果数组长度是2个以上
            mid = (low + high) / 2;
            // 假如最左边和中间以及最右边值都相等，只能进行顺序查找，如 {1,1,1,0,1}
            if (arr[low] == arr[mid] && arr[low] == arr[high]) {
                return orderFind(arr, low, high);
            }
            // 如果最左边小于等于中间值，说明最小值在后半部分，把mid位置标记为最左侧，如 {3,4,5,1,2}
            if (arr[mid] >= arr[low]) {
                low = mid;
            } else {     // 如果最左侧大于等于中间值，说明最小值在前半部分，把mid位置标记为最右侧，如 {4,5,1,2,3}
                high = mid;
            }
        }
        return arr[mid];
    }

    public static int orderFind(int[] arr, int low, int high) {
        int min = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
