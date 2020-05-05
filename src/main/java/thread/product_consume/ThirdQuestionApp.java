package thread.product_consume;

/**
 * 问题3：虽然数据安全了，但是呢，一次一大片不好看，我就想依次的一次一个输出。
 * 解决：
 * 		通过Java提供的等待唤醒机制解决。
 *
 * 等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait()：等待，立即释放锁
 * 			notify()：唤醒单个线程
 * 			notifyAll()：唤醒所有线程
 *
 * 		为什么这些方法不定义在Thread类中呢?
 * 			这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象。
 * 			所以，这些方法必须定义在Object类中。
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class ThirdQuestionApp {
    public static void main(String[] args) {
        //创建资源
        Student stu = new Student();

        //设置和获取的类
        ThirdProductQuestion tpq = new ThirdProductQuestion(stu);
        ThirdConsumeQuestion tcq = new ThirdConsumeQuestion(stu);

        //线程类
        Thread t1 = new Thread(tpq);
        Thread t2 = new Thread(tcq);

        //启动线程
        t1.start();
        t2.start();
    }
}
