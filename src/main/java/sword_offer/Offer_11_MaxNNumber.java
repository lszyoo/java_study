package sword_offer;

/**
 * 大数问题：
 *
 * 输入数字n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999
 */
public class Offer_11_MaxNNumber {
    public static void main(String[] args) {
        char[] chars = new char[2];
        chars[0] = '1';
        chars[1] = '0';
        System.out.println(chars);
        // 输出：10

        printMaxNDigit(3);

        // 不考虑大数问题
        printMaxNDigit1(3);
    }

    public static void printMaxNDigit(int n){
        if(n <= 0)
            System.out.println("非法输入！！！");;

        char[] number = new char[n];
        for(int i = 0; i < 10; i++){
            // 设置首位数字，0、1、2、3、...
            number[0]=(char) (i + '0');
            printOthers(number, n, 0);
        }
    }

    public static void printOthers(char[] number, int n, int index){
        if(index == n - 1){
            // 所有的数都找到了
            printNumber(number);
            return;
        }
        // 每位上的数不能大于 9
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            // 先是将 number[]所有的位置都设置为 0，再从末尾一直往上加
            // 逢十将返回上一个递归实现逢十进一的操作
            printOthers(number, n, index + 1);
        }
    }

    // 输出数字
    public static void printNumber(char[] number){
        boolean isBeginZero = true;
        int len = number.length;
        for (int i = 0; i < len; i++) {
            if(isBeginZero && number[i] != '0')
                isBeginZero = false;
            if(!isBeginZero){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    /**
     * 默认为最大数值为long型，没有考虑长整型也会溢出的情况
     * @param n
     */
    public static void printMaxNDigit1(int n){
        long number = 1;
        int i = 0;
        // 利用 while 循环计算出比 n 位十进制多1的数
        while(i < n){
            number *= 10;
            ++i;
        }
        // 利用 for 循环输出从1到最大的n位数
        for (long j = 1; j < number; ++j) {
            System.out.print(j + " ");
            if(j % 5 == 0){
                System.out.println();
            }
        }
    }
}
