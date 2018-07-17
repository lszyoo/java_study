package function.defined;

/**
 *  1、return 会结束循环
 *  2、if(flag = false)      不能这样写，否则永远也进不到if条件句里边
 */
public class StringSymmetry {
    public static void main(String[] args) {
        System.out.println(symmetry("aetuta"));
        System.out.println(symmetry1("aetutea"));
    }

    /**
     * 判断字符串是否对称
     * @param str
     * @return
     */
    public static Boolean symmetry(String str) {
        int len = str.length();
        boolean flag = true;
        if (len > 1){
            for (int i = 0; i < len / 2; i++) {

                if (str.charAt(i) == str.charAt(len - 1 - i))
                    flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            return flag;
        } else
            return false;
//        return true;      // 上边 return 的要是 true/false，此处需添加，否则注掉（即使是值为 ture/false 的变量）
    }

    public static boolean symmetry1(String str) {
        int len = str.length();
        int index = 0;
        boolean flag = true;
        if (len > 1) {
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) != str.charAt(len - 1 - i)) {
                    flag = false;
                    break;
                } else {
                    index++;
                    if (index - 1 == len / 2) {
                        flag = true;
                        break;
                    }
                }
            }
            return flag;
        } else
            return false;
    }
}
