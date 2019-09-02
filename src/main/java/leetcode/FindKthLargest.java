package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 215、编程实现 O(n) 时间复杂度内找到一组数据第 K 大元素。
 */
public class FindKthLargest {
    public static void main(String[] args) {
        System.out.println(findKthLargest1(new int[]{3, 4, 9, 1}, 2));
        System.out.println(findKthLargest2(new int[]{3, 4, 9, 1}, 2));
        System.out.println(findKthLargest3(new int[]{3, 4, 9, 1}, 2));
    }

    public static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            maxHeap.offer(i);
        }
        while (k-- > 1) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }

    public static int findKthLargest3(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length - k;
        while (start < end) {
            int pivot = partition(nums, start, end);
            if (pivot < index) {
                start = pivot + 1;
            } else if (pivot > index) {
                end = pivot - 1;
            } else {
                return nums[pivot];
            }
        }
        return nums[start];
    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = start;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) {
                start++;
            }
            while (start <= end && nums[end] > nums[pivot]) {
                end--;
            }
            if (start > end) {
                break;
            }
            swap(nums, start, end);
        }
        swap(nums, start, end);
        return end;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
