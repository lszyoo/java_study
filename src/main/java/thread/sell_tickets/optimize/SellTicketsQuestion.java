package thread.sell_tickets.optimize;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsQuestion implements Runnable {
    // 定义100张票
    private int tickets = 100;

    /*
	@Override
	public void run() {
		while (true) {
			// t1,t2,t3三个线程
			// 这一次的tickets = 100;
			if (tickets > 0) {
				// 为了模拟更真实的场景，我们稍作休息
				try {
					Thread.sleep(100); // t1就稍作休息,t2就稍作休息
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "正在出售第 "
						+ (tickets--) + " 张票");
				// 理想状态：
				// 窗口1正在出售第100张票
				// 窗口2正在出售第99张票
				// 但是呢?
				// CPU的每一次执行必须是一个原子性(最简单基本的)的操作。但 ticket-- 不是原子性操作
				// 先记录以前的值 100
				// 接着 ticket--
				// 然后输出以前的值(t2来了)
				// ticket的值就变成了99
				// 窗口 1 正在出售第 100 张票
				// 窗口 2 正在出售第 100 张票

			}
		}
	}
	*/

    @Override
    public void run() {
        while (true) {
            // t1,t2,t3三个线程
            // 这一次的tickets = 1;
            if (tickets > 0) {
                // 为了模拟更真实的场景，我们稍作休息
                try {
                    Thread.sleep(100); //t1进来了并休息，t2进来了并休息，t3进来了并休息，
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "正在出售第 "
                        + (tickets--) + " 张票");
                //窗口 1 正在出售第 1 张票，tickets = 0
                //窗口 2 正在出售第 0 张票，tickets = -1
                //窗口 3 正在出售第 -1 张票，tickets = -2
            }
        }
    }
}
