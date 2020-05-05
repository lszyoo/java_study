package thread.sell_tickets.optimize;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsSynchronized implements Runnable {
    // 定义100张票
    private int tickets = 100;
    //创建锁对象
    private Object obj = new Object();

    /*
	@Override
	public void run() {
		while (true) {
			synchronized(new Object()){  // 创建多个对象。无法锁住
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第"
							+ (tickets--) + "张票");
				}
			}
		}
	}
    */

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + " 正在出售第 " + (tickets--) + " 张票");
                }
            }
        }
    }
}
