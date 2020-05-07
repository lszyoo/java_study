package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反射忽略泛型
 *      ArrayList<Integer>，在这个集合中添加一个字符串数据
 * 泛型机制只是给编译器看的，源码中是Object
 * @author liushuai
 * @create 2020/5/7
 */
public class ReflectIgnoreGeneric {
    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        // 创建集合对象
        ArrayList<Integer> array = new ArrayList<Integer>();

        // array.add("hello");
        // array.add(10);

        Class c = array.getClass(); // 集合ArrayList的class文件对象
        Method m = c.getMethod("add", Object.class);

        m.invoke(array, "hello"); // 调用array的add方法，传入的值是hello
        m.invoke(array, "world");
        m.invoke(array, "java");

        System.out.println(array);
        // [hello, world, java]
    }
}
