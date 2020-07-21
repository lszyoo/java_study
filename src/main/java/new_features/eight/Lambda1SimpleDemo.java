package new_features.eight;

/**
 * lambda 表达式
 * 简单例子：
 *      // 1. 不需要参数,返回值为 5
 *      () -> 5
 *
 *      // 2. 接收一个参数(数字类型),返回其2倍的值
 *      x -> 2 * x
 *
 *      // 3. 接受2个参数(数字),并返回他们的差值
 *      (x, y) -> x – y
 *
 *      // 4. 接收2个int型整数,返回他们的和
 *      (int x, int y) -> x + y
 *
 *      // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
 *      (String s) -> System.out.print(s)
 *
 * 专门针对只有 一个方法 的接口：
 * （1）只能是接口，否则报：Target type of a lambda conversion must be an interface
 * （2）只能有一个public方法，否则报：Multiple non-overriding abstract methods found xxx
 *
 * @author liushuai
 * @create 2020/5/17
 */
public class Lambda1SimpleDemo {
    public static void main(String[] args) {
        // 不需要参数,返回值为 5
        MathOperation mo1 = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation mo2 = (a, b) -> a + b;

        // 大括号中的返回语句
        MathOperation mo3 = (a, b) -> {
            int c = a * b;
            return c;
        };

        System.out.println(mo1.operation(1, 3));    // 4
        System.out.println(mo2.operation(1, 3));    // 4
        System.out.println(mo3.operation(1, 3));    // 3
    }

    // 专门针对只有 一个方法 的接口，定义两个方法 lambda 表达式报错
    interface MathOperation {
        int operation(int a, int b);
    }
}
