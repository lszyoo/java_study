package algorithm.sword_offer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 注意：用 while 循环来进行数组的行列增删，而不是新建数组，拉低效率且浪费空间
 * 思路：从右上角开始进行判断，等于则返回，小于最右则删除该列，大于最右则删除该行
 *      1 2 3 9
 *      2 4 8 12
 *      3 5 9 19
 */
public class Offer_1_TwoDimensionArraySearch {
    public static void main(String[] args) {
        // 定义二维数组
        int[][] arr = new int[][]{{1, 2, 3, 9}, {2, 4, 8, 12}, {3, 5, 9, 19}};
        boolean isContain = twoDimensionArraySearch(arr, 9);
        System.out.println(isContain);
        // 输出：true
    }

    public static boolean twoDimensionArraySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row <= arr.length - 1 && col >= 0) {
            if (target == arr[row][col]) {
                // 输出出现的具体位置
                System.out.println(row + "," + col);
                // 输出：0,3
                return true;
            } else if (target > arr[row][col])
                row ++;
            else
                col --;
        }
        return false;
    }
}
