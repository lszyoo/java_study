package sword_offer;

/**
 * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方
 *
 * 1、全面考察指数的正负、底数是否为零等情况。
 * 2、写出指数的二进制表达，例如 13 表达为二进制 1101。
 * 3、举例:10^1101 = 10^0001*10^0100*10^1000。
 * 4、通过 &1 和 >>1 来逐位读取 1101，为 1 时将该位代表的乘数累乘到最终结果。
 *
 * eg：如果输入的指数 exponent 为 32，我们的目标是求出一个数字的 32 次方，如果我们已经知道了它的 16 次方，
 *     那么只要在 16 次方的基础上再平方一次就可以了。而 16 次方是 8 次方的平方，这样一次类推，我们求 32
 *     次方只需要做5 次乘法：先求平方，在平方的基础上求 4 次方，在 4 次方的基础上求 8 次方，在 8 次方的基
 *     础上求 16 次方，最后在 16 次方的基础上求 32 次方。
 *
 *     32 -> 100000  右移 5 次
 *
 * 快速幂的方式 O(logn)
 */
public class Offer_10_Power {
    public static void main(String[] args) {
        System.out.println(power(1.5, 10));
        // 输出：2.25
        System.out.println(5 & 1);
        // 输出：1 奇 0 偶，效率别 %2 高的多
        System.out.println(13 >> 1);
        // 输出：6（整体右移 1 位）
    }

    public static double power(double base, int exponent) {
        double result = 1;
        int n = 0;
        if (exponent > 0)
            n = exponent;
        else if (exponent < 0) {
            // float 和 double 均有误差，因此不能直接和 0 进行大小比较，而是差值小于某个范围
            if(base - 0 < 0.000001)
                throw new RuntimeException("分母不能为 0");
            n = - exponent;
        } else {
            // 任何数的 0 次幂均为 1
            return 1;
        }

        while (n != 0) {
            // 如果 n 是奇数
            if ((n & 1) == 1)
                result *= base;
            // base 翻倍
            base *= base;
            // n 右移一位
            n >>= 1;
        }
        return exponent >= 0 ? result : 1 / result;
    }
}
