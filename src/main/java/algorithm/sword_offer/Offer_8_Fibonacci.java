package algorithm.sword_offer;

/**
 * 输入一个整数 n，请你输出斐波那契数列的第 n 项（n <= 39）
 *      { 0 (n=0)
 * f(n)={ 1 (n=1)
 *      { f(n-1)+f(n-2) (n>1)
 *
 */
public class Offer_8_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
        // 输出：8
        System.out.println(Fibonacci1(6));
        // 输出：8
        System.out.println(Fibonacci2(6));
        // 输出：8

        System.out.println(jumpFloor(6));
        // 输出：13
        System.out.println(jumpFloor1(6));
        // 输出：32
        System.out.println(rectCover(6));
        // 输出：13
    }

    // 不必追求递归，因为递归代码简洁但每次调用都得消耗时间和空间，容易造成内存调用栈的溢出，尤其是层级很高的时候。效率不是很高。
    public static int Fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2)
            return result[n];
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    public static long Fibonacci1(int n) {
        long[] arr = new long[n + 1];
        arr[0]=0;
        arr[1]=1;
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // 递归
    public static int Fibonacci2(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibonacci2(n - 1) + Fibonacci2(n - 2);
    }

    /**
     * 跳上 n 级台阶总共多少种跳法？
     * 青蛙跳台阶：可跳 1、2 级
     *
     * 但注意初始值的数值，不是 0、1，而是 0、1、2
     */
    public static int jumpFloor(int n) {
        int[] arr = {0, 1, 2};
        if (n <= 2)
            return arr[n];
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    /**
     * 跳上 n 级台阶总共多少种跳法？
     * 青蛙跳台阶：可跳 1、2、3、...、n 级
     *
     * 经过推算：
     *      1 n=1
     *      2 n=2
     *      4 n=3
     *      8 n=4
     *      f(n) = 2^(n-1)
     */
    public static int jumpFloor1(int n) {
        if(n == 1)
            return 1;
        int fn = 0;
        int f1 = 1;
        for (int i = 2; i <= n; i++) {
            fn = f1 * 2;
            f1 = fn;
        }
        return fn;
    }

    /**
     * 矩形覆盖：
     *      我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
     *      请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法?
     */
    public static int rectCover(int n) {
        return jumpFloor(n);
    }
}
