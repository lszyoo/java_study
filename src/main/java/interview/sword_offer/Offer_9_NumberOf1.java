package interview.sword_offer;

/**
 * 输入一个整数，输出该数二进制表示中 1 的个数。
 *
 * 如：9 - 1001 - 2
 */
public class Offer_9_NumberOf1 {
    public static void main(String[] args) {
        System.out.println(numberOf1(128));
        // 输出：7
    }

    /**
     *  把一个整数减去 1 再和原整数相与，其得到的结果是将最右边的 1 变为 0，有多少个 1 就
     *  会参与多少次这种运算。从而得到一个二进制整数中 1 的个数
     */
    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = (n - 1) & n;
            count++;
        }
        return count;
    }
}
