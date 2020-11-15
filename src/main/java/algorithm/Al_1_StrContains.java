package algorithm;

/**
 * 阿里飞猪 2020.11.02
 *
 * 判断字符串A是否包含子字符串B
 *
 * @author liushuai
 * @create 2020/11/2
 */
public class Al_1_StrContains {
    public static void main(String[] args) {
        boolean flag = strContains("abcdfdfdfsde", "ab");
        System.out.println(flag);
    }

    public static boolean strContains(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.equals("") || B.equals("")) {
            return false;
        }
        

        int len = 0;
        for (int i = 0; i < A.length(); i++) {
            while (A.charAt(i) == B.charAt(len)) {
                len++;
                if (len == B.length()) {
                    return true;
                }
                i++;
            }
            len = 0;
        }
        return false;
    }
}
