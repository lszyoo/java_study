package day20200824;

public class Offer_1_TwoDimensionArraySearch {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 9}, {2, 4, 8, 12}, {3, 5, 9, 19}};
        int target = 5;

        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {
                System.out.println(true + " 行：" + row + " 列：" + col);
                return;     // 注意不要造成死循环
            }
            else if (target > arr[row][col])
                row++;
            else
                col--;
        }
        System.out.println(false);
    }
}
