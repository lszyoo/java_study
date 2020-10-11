package datastruct;

import java.util.ArrayList;

/**
 * 两个线性表取并集
 */
public class Struct_2_TwoLinerUnion {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        b.add("c");
        b.add("d");
        b.add("e");
        System.out.println(twoLinerUnion(a, b));
        // 输出：[c, d, e, a, b]
    }

    public static ArrayList<String> twoLinerUnion(ArrayList<String> a, ArrayList<String> b) {
        for (String s : a) {
            if (b.contains(s)) {
                continue;
            } else {
                b.add(s);
            }
        }
        return b;
    }
}
