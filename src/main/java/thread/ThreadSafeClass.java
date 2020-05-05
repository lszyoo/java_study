package thread;

import java.util.*;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class ThreadSafeClass {
    public static void main(String[] args) {
        // 线程安全的类
        StringBuffer sb = new StringBuffer();
        Vector<String> vector = new Vector<>();
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Vector 一般不用，创建线程安全的 List 如下：
        // public static <T> List<T> synchronizedList(List<T> list)
        List<String> list1 = new ArrayList<>(); // 线程不安全
        List<String> list2 = Collections
                .synchronizedList(new ArrayList<String>()); // 线程安全
    }
}
