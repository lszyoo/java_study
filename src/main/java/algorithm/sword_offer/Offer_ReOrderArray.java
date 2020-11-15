package algorithm.sword_offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于
 * 位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 *
 * 解题思路：
 *      1、要想保证原有次序，则只能顺次移动或相邻交换。
 *      2、i 从左向右遍历，找到第一个偶数。
 *      3、j 从 i+1 开始向后找，直到找到第一个奇数。
 *      4、将[i,...,j-1]的元素整体后移一位，最后将找到的奇数放入 i 位置，然后 i++。
 *      5、終止条件: j 向后遍历查找失敗。
 */
public class Offer_ReOrderArray {
    public static void main(String[] args) {

    }

//    public static int[] reOrderArray(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return null;
//        }
//
//    }
}
