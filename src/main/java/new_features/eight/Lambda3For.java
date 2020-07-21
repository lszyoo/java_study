package new_features.eight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author liushuai
 * @create 2020/5/17
 */
public class Lambda3For {
    public static void main(String[] args) {
        String[] strs = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka"};
        List<String> list = Arrays.asList(strs);

        // 以前的循环方式
        for (String s : list) {
            System.out.println(s);
        }
        /*
            Rafael Nadal
            Novak Djokovic
            Stanislas Wawrinka
         */

        // 使用 lambda 表达式以及函数操作(functional operation)
        list.forEach((s) -> System.out.println(s));
        /*
            Rafael Nadal
            Novak Djokovic
            Stanislas Wawrinka
         */

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        list.forEach(System.out::println);
        /*
            Rafael Nadal
            Novak Djokovic
            Stanislas Wawrinka
         */

        HashMap<String, Double> map = new HashMap<>();
        map.put("刘备", 90.0);
        map.put("张飞", 85.0);
        map.put("关羽", 100.0);
        map.forEach((k, v) -> {
            if (v < 100.0) {
                System.out.println(k + ":" + map.get(k));
            }
        });
        /*
          张飞:85.0
          刘备:90.0
         */
    }
}
