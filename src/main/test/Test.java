import org.apache.commons.lang3.StringUtils;

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

    }
}
