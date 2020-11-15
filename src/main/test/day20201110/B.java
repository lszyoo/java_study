package day20201110;

import org.apache.commons.collections.IteratorUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class B implements A {
    public void test () {

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(5);
        list.add(10);

        Iterator it = list.iterator();
//        System.out.println(IteratorUtils.toList(it));

        while (it.hasNext()) {
            int rm = (int) it.next();
            if (rm == 10) {
                it.remove();
            }
        }
//        System.out.println(IteratorUtils.toList(it));
        System.out.println(list);
    }
}
