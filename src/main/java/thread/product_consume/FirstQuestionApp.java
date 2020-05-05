package thread.product_consume;

/**
 * 分析：
 * 		资源类：Student
 * 		设置学生数据：FirstProductQuestion（生产者）
 * 		获取学生数据：FirstConsumeQuestion（消费者）
 * 		测试类：FirstQuestionApp
 *
 * 问题1：按照思路写代码，发现数据每次都是：null---0
 * 原因：我们在每个线程中都创建了新的资源,而我们要求的时候设置和获取线程的资源应该是同一个
 * 解决：
 * 		在外界把这个数据创建出来，通过构造方法传递给其他的类。
 * @author liushuai
 * @create 2020/5/4
 */
public class FirstQuestionApp {
    public static void main(String[] args) {
        // 创建资源
        Student stu = new Student();

        // 生产者和消费者
        FirstProductQuestion fpq = new FirstProductQuestion(stu);
        FirstConsumeQuestion fcq = new FirstConsumeQuestion(stu);

        // 线程类
        Thread t1 = new Thread(fpq);
        Thread t2 = new Thread(fcq);

        // 启动线程
        t1.start();
        t2.start();
    }
}
