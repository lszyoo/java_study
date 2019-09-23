import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = " ss";
        if (StringUtils.isNotBlank(s)) {
            System.out.println("===");
        }

        Boolean isMatch = Pattern.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,}$", "sdsdsd");
        System.out.println(isMatch);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.subList(0, 2));

        boolean flag = new Random().nextBoolean();
        int i = 0;
        while (new Random().nextBoolean()) {
            System.out.println(i);
            i++;
        }


        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        String str = list1.toString();
        System.out.println("=====" + str.substring(1, str.length() - 1));


        String a = "abc";
        a = "bcd";
        System.out.println(11/10);

        Map map = new HashMap();
        map.put("a", null);

        int[] arr = {1, 2, 3, 4};
        String str2 = ArrayUtils.toString(arr, ","); // 数组转字符串(逗号分隔,首尾加大括号)
        System.out.println(str2.substring(1, str2.length() - 1)); // {0,1,2,3,4,5}


        System.out.println((char)('0' + 0));

        System.out.println(1 == 1l);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        List list2 = new ArrayList();
        list2.add("abc");
        list2.add("bcd");
        List list3 = new ArrayList();
        for (Object o : list2) {
            o = "\'" + o + "\'";
            list3.add(o);
        }
        String emaliStr = ArrayUtils.toString(list3.toArray(), ",");
        System.out.println(emaliStr.substring(1, emaliStr.length() - 1));
    }
}
