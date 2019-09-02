package algorithm;

/**
 * 返回子串 t 在主串 s 中第 pos 个字符之后的位置。若不存在，则返回 0
 */
public class KMP {
    public static void main(String[] args) {
        System.out.println(index1("good mornig", "o", 1));
        System.out.println(index2("good mornig", "o", 1));
    }

    // 方式一：朴素模式匹配算法
    private static int index1(String s, String t, int pos) {
        if (s.isEmpty() || t.isEmpty() || pos > s.length() || t.length() > s.length())
            return 0;
        else {
            int i = pos;        // i 表示主串当前下标位置
            int j = 0;          // j 表示子串当前下标位置
            while (i < s.length() && j < t.length()) {  // j < t.length() 当遇到第一个相等的子字符串，跳出循环
                if (s.charAt(i) == t.charAt(j)) {       // 两字母相等则继续
                    i++;
                    j++;
                } else {
                    i = i - j + 1;      // i 退回到上次匹配首位的下一位
                    j = 0;              // j 退回到子串的首位
                }
            }
            // i - t.length() + 1 为主串减去子串的长度
            if (i - t.length() + 1 >= pos && j != 0)
                return i - j;
            else
                return 0;
        }
    }

    // 方式二
    private static int index2(String s, String t, int pos) {
        if ((!s.isEmpty()) && (!t.isEmpty()) && pos < s.length() - t.length() && t.length() < s.length()) {
            int m = t.length();
            int i = pos;           // i 表示主串当前下标位置
            while (i <= s.length() - m + 1) {      // 若剩余字符长度小于子串长度，那么就不必比较之后的了，即不必遍历到最后
                String sub = s.substring(i, i + m);
                if (!sub.equals(t))
                    ++i;
                else
                    return i;       // 当遇到第一个相等的子字符串，跳出循环
            }
        }
        return 0;
    }


    /**
     * 上述两种算法效率很低，下面是 kmp 模式匹配算法
     */




}
