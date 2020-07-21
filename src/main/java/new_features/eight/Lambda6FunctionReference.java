package new_features.eight;

import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 方法引用
 *
 * @author liushuai
 * @create 2020/7/21
 */
public class Lambda6FunctionReference {
    public static void main(String[] args) {
        class Student {
        }

        /**
         * 构造引用：当Lambda表达式是通过new一个对象来完成的，那么可以使用构造引用。
         * 实际过程：将new Student()赋值给了Supplier这个函数式接口中的那个抽象方法
         */
        Supplier<Student> supplier1 = () -> new Student();
        Supplier<Student> supplier2 = Student::new;

        /**
         * 类名::实例方法
         * Lambda表达式的的Lambda体也是通过一个对象的方法完成，但是调用方法的对象是Lambda表达式的参数列表中的一个，
         * 剩下的参数正好是给这个方法的实参。
         */
        // 编译器会有提示：Can be replaced with Comparator.naturalOrder，这句话告诉我们String已经重写了compareTo()方法，在这里写是多此一举
        TreeSet<String> set1 = new TreeSet<>((s1, s2) -> s1.compareTo(s2));
        // 编译器的提示：Lambda can be replaced with method reference
        // 类名::实例方法
        TreeSet<String> set2 = new TreeSet<>(String::compareTo);
        set2.add("World");
        set2.add("Hello");
        set2.forEach(t -> System.out.println(t));
        /*
          排序输出：
              Hello
              World
         */

        /**
         * 对象::实例方法,Lambda表达式的(形参列表)与实例方法的(实参列表)类型，个数是对应
         */
        set2.forEach(System.out::println);
        /*
          排序输出：
              Hello
              World
         */

        /**
         * 类名::静态方法，Lambda表达式的(形参列表)与实例方法的(实参列表)类型，个数是对应
         */
        Stream<Double> stream1 = Stream.generate(() -> Math.random());
        Stream<Double> stream2= Stream.generate(Math::random);
        stream2.forEach(System.out::println);
        /*
          输出：
            0.36154025913842514
            0.11184949962966506
            0.16731912243577052
            0.9664548767992827
            0.935888639243707
            0.884822890152338
            0.8517773248134558
         */
    }


}
