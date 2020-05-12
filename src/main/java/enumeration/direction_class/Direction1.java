package enumeration.direction_class;

/**
 * 枚举类：
 *      是指将变量的值一一列出来,变量的值只限于列举出来的值的范围内。举例：一周只有7天，一年只有12个月等。
 *      回想单例设计模式：单例类是一个类只有一个实例
 *      那么多例类就是一个类有多个实例，但不是无限个数的实例，而是有限个数的实例。这才能是枚举类。
 *
 * @author liushuai
 * @create 2020/5/11
 */
public class Direction1 {
    // 创建几个实例
    public static final Direction1 FRONT = new Direction1();
    public static final Direction1 BEHIND = new Direction1();
    public static final Direction1 LEFT = new Direction1();
    public static final Direction1 RIGHT = new Direction1();

    // 构造私有，别人就不能无限的创建了
    private Direction1() {
    }
}
