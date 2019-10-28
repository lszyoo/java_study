import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class TestMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/gengmei/gengmei/java_study/src/main/test/word.txt")));
        String line = null;
        // 字典顺序，无序
//        Map<String, String> lineMap = new HashMap<>();
        // 按照插入顺序，有序
        Map<String, String> lineMap = new LinkedHashMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            if (!lineMap.containsKey(arr[0]))
                lineMap.put(arr[0], arr[1]);
            else {
                int value = Integer.valueOf(lineMap.get(arr[0])) + Integer.valueOf(arr[1]);
                lineMap.put(arr[0], String.valueOf(value));
            }
        }
        System.out.println(lineMap);
        // 输出：{a=5, b=3, c=10}
        System.out.println(lineMap.keySet());
        // 输出：[a, b, c]
        System.out.println(lineMap.entrySet());
        // 输出：[a=5, b=3, c=10]
        for (Map.Entry<String, String> entry : lineMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        /*
          输出：
                a, 5
                b, 3
                c, 10
         */


        // 按 value 排序
        List<Map.Entry<String, String>> list = new ArrayList<>(lineMap.entrySet());
        // 通过比较器实现比较排序
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> map1, Map.Entry<String, String> map2) {
                return Integer.valueOf(map1.getValue()).compareTo(Integer.valueOf(map2.getValue()));
            }
        });
        System.out.println(list);
        // 输出：[b=3, a=5, c=10]
    }
}
