package thread.sell_tickets.optimize;

/**
 * 1、同步代码块的锁对象是：任意对象。
 * 2、同步方法的锁对象是：this
 * 3、静态方法的锁对象是：类的字节码文件对象，即 *.class
 *
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsSynchronizedFunApp {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicketsSynchronizedFun st = new SellTicketsSynchronizedFun();

        // 创建三个线程对象
        Thread t1 = new Thread(st, "窗口 1 ");
        Thread t2 = new Thread(st, "窗口 2 ");
        Thread t3 = new Thread(st, "窗口 3 ");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
