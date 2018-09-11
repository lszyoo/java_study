package on_coampus_recruitment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 字符串形成闭环，从某处切开或反序，若能得到另一个元素，则返回 yeah，否则返回 sad
 * 示例：
 *      3
 *      2
 *      aabcd
 *      bcdaa
 *      2
 *      abcd
 *      dcba
 * 输出：
 *      yeah
 *      yeah
 */
public class PairsOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0)
            return;
        List[] arr = new List[n];

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());
            if (m <= 1)
                return;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                String str = sc.nextLine();
                list.add(str);
            }
            arr[i] = list;
        }

        for (List list : arr) {
            a:for (int i = 0; i < list.size() - 1; i++) {
                String str1 = list.get(i).toString();
                for (int j = i + 1; j < list.size(); j++) {
                    String str2 = list.get(j).toString();
                    if (str1.length() == str2.length()) {
                        for (int k = 0; k < str2.length(); k++) {
                            StringBuilder builder = new StringBuilder();
                            builder.append(str2.substring(k, str2.length())).append(str2.substring(0, k));
                            if (builder.toString().equals(str1) || builder.reverse().toString().equals(str1)) {
                                System.out.println("yeah");
                                break a;
                            }
                        }
                    }
                    if (j == list.size() - 1) {
                        System.out.println("sad");
                        break a;
                    }
                }
            }
        }
    }
}
