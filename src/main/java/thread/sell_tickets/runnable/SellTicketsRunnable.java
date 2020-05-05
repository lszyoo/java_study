package thread.sell_tickets.runnable;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsRunnable implements Runnable {
    // 定义100张票
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " 正在出售第 "
                        + (tickets--) + " 张票");
            }
        }
    }
}
