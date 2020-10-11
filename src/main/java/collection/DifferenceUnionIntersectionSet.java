package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 差集、并集、交集
 *
 * @author liushuai
 * @date 2020-09-22
 */
public class DifferenceUnionIntersectionSet {
    public static void main(String[] args) {
        Set<String> result = new HashSet<>();

        Set<String> set1 = new HashSet<String>() {
            {
                add("王者荣耀");
                add("英雄联盟");
                add("穿越火线");
                add("地下城与勇士");
            }
        };
        Set<String> set2 = new HashSet<String>() {
            {
                add("王者荣耀");
                add("地下城与勇士");
                add("魔兽世界");
            }
        };

        result.clear();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("交集：" + result);
        // 交集：[王者荣耀, 地下城与勇士]

        result.clear();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("差集：" + result);
        // 差集：[英雄联盟, 穿越火线]

        result.clear();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("并集：" + result);
        // 并集：[王者荣耀, 英雄联盟, 魔兽世界, 地下城与勇士, 穿越火线]
    }
}
