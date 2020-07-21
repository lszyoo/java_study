package new_features.eight;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda 表达式表示集合排序
 *
 * @author liushuai
 * @create 2020/5/17
 */
public class Lambda5CollectionSort {
    public static void main(String[] args) {
        String[] strs = {"c", "d", "b", "a"};

        // 1.1 使用匿名内部类排序
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        System.out.println(Arrays.asList(strs));
        // [a, b, c, d]

        // 1.2 使用 lambda expression 排序
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(strs, sortByName);

        // 1.3 也可以采用如下形式:
        Arrays.sort(strs, (String s1, String s2) -> (s1.compareTo(s2)));
    }
}
