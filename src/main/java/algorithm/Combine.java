package algorithm;
/**
 * 求全组合：
 *      基本思路：假设有元素n个，则最终组合结果是2^n个。
 *      原因是：
 *          用位操作方法：假设元素有：a,b,c 三个，则1表示取元素，0表示不取。故取 a 则是 001，取 ab 则是 011。
 *                      所以一共三位，每个位上有两个选择 0,1，所以是2^n个结果。
 *                      这些结果的位图值都是0,1,2....2^n。
 *                      所以可以类似全真表一样，从值0到值2^n依次输出结果：000,001,010,011,100,101,110,111 。
 *                      对应输出组合结果为：空, a, b , ab, c, ac, bc, abc
 *                      这个输出顺序刚好跟数字0~2^n结果递增顺序一样
 *                      取法的二进制数其实就是从0到2^n-1的十进制数
 */
public class Combine {

    public static void main(String[] args) {
        Combine cb = new Combine();
        cb.combination(new String[]{"a", "b", "c", "d"});
    }

    public void combination(String[] strs) {
        // n 个元素
        int n = strs.length;
        // 求出位图全组合的结果个数：2^n
        // “<<” 表示 左移：各二进位全部左移若干位，高位丢弃，低位补0。即：求出2^n=2Bit。
        int nbit = 1 << n;
        System.out.println("全组合结果个数为："+nbit);
        // 结果有nbit个。输出结果从数字小到大输出：0,1,2,3,....2^n
        for(int i = 0; i < nbit; i++) {
            System.out.print("组合数值  " + i + " 对应编码为： ");
            // 每个数二进制最多可以左移 n 次，即遍历完所有可能的变化得到新二进数值
            for(int j = 0; j < n; j++) {
                int tmp = 1 << j;
                // & 表示，两个位都为1时，结果才为1
                if((tmp & i)!=0) {
                    System.out.print(strs[j]);
                }
            }
            System.out.println();
        }
    }
}
