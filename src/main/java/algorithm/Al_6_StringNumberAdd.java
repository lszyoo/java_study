package algorithm;

/**
 * 两个特别大的数字右对齐相加
 *
 * 如：
 *      a = "123...456"
 *      b =   "31..123"
 * 求：a + b = ？
 * 注意进位的问题
 */
public class Al_6_StringNumberAdd {
    public static void main(String[] args) {
        System.out.println(12 % 10);
        System.out.println(2 / 10);

        System.out.println(stringNumberAdd("144", "999456"));
    }

    public static String stringNumberAdd(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int len = Math.abs(alen - blen);

        String c = null;
        String d = null;
        String e = null;
        if (alen >= blen) {
            c = a.substring(len, alen);
            d = a.substring(0, len);
            e = b;
        } else {
            c = b.substring(len, blen);
            d = b.substring(0, len);
            e = a;
        }
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int tmp = Integer.parseInt(String.valueOf(c.charAt(i))) + Integer.parseInt(String.valueOf(e.charAt(i))) + carry;
            if (tmp < 10) {
                sb.append(tmp);
            } else {
                sb.append(tmp % 10);
                carry = 1;
            }
        }
        for (int i = d.length() - 1; i >= 0; i--) {
            int tmp = Integer.parseInt(String.valueOf(d.charAt(i))) + carry;
            if (tmp < 10) {
                sb.append(tmp);
            } else {
                sb.append(tmp % 10);
                carry = 1;
                if (i == 0) {
                    sb.append(carry);
                }
            }
        }
        return sb.reverse().toString();
    }
}
