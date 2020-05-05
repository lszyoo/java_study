package thread.sell_tickets.optimize;

/**
 * 判断一个程序是否会有线程安全问题的标准：
 * （1）是否是多线程环境 -- 不可优化
 * （2）是否有共享数据 -- 不可优化
 * （3）是否有多条语句操作共享数据 -- 可优化
 *
 * java 提供了同步机制。
 * 同步代码块：
 * 		synchronized(任意对象){
 * 			需要同步的代码;
 * 		}
 * 注意：
 *     同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 	   多个线程必须是同一把锁。
 *
 * 同步的好处：
 *		同步的出现解决了多线程的安全问题。
 * 同步的弊端：
 *		当线程相当多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率。
 *
 * @author
 * @create 2020/5/3
 */
public class SellTicketsSynchronizedApp {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicketsSynchronized st = new SellTicketsSynchronized();

        // 创建三个线程对象
        Thread t1 = new Thread(st, "窗口 1");
        Thread t2 = new Thread(st, "窗口 2");
        Thread t3 = new Thread(st, "窗口 3");


        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
