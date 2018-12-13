package on_coampus_recruitment;

import java.util.*;

/**
 * 输入一个字符串，找出没有重复字符的最长子字符串的长度
 * 示例：
 *      "abcabcbb" --> 3
 *      "bbbbbbbb" --> 1
 *      "abdevbac" --> 6
 */
public class LongestNoRepetitionSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() == 0)
            return;

        String sub;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i; j < str.length(); j++) {
                sub = str.substring(i, j + 1);
                Set<String> set = new HashSet<>(Arrays.asList(sub.split("")));
                if (set.size() == sub.length()) {
                    list.add(sub.length());
                }
            }
        }
        System.out.println(Collections.max(list));
    }
}






//    int sum = 1;
//        for (int i = 0; i < str.length() - 1; i++) {
//        if (str.charAt(i) != str.charAt(i + 1)) {
//        sum++;
//        } else {
//        list.add(sum);
//        sum = 1;
//        if (list.isEmpty())
//        list.add(1);
//        }
//        }
//        System.out.println(Collections.max(list));