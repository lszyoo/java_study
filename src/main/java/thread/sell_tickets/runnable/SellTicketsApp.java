package thread.sell_tickets.runnable;

/**
 * 实现Runnable接口的方式实现，此种方式更适合，只需要创建一个对象
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsApp {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicketsRunnable st = new SellTicketsRunnable();

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
