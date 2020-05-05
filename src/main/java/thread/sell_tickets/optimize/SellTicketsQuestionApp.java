package thread.sell_tickets.optimize;

/**
 * 实现Runnable接口的方式实现
 *
 * 通过加入延迟后，就产生了连个问题：
 * （1）相同的票卖了多次
 * 		  CPU的一次操作必须是原子性的
 * （2）出现了负数票
 * 		  随机性和延迟导致的
 *
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsQuestionApp {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicketsQuestion st = new SellTicketsQuestion();

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
