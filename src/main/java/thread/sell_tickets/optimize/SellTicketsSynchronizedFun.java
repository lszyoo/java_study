package thread.sell_tickets.optimize;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsSynchronizedFun implements Runnable {
    // 定义100张票
    // private int tickets = 100;
    private static int tickets = 100;

    // 定义同一把锁
    private Object obj = new Object();
    private Tickets t = new Tickets();

    private int x = 0;

    /*
    // 同步代码块用obj做锁
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
							+ "正在出售第" + (tickets--) + "张票 ");
				}
			}
		}
	}
	*/

    /*
    // 同步代码块用任意对象做锁
	@Override
	public void run() {
		while (true) {
			synchronized (t) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票 ");
				}
			}
		}
	}
	*/

    @Override
    public void run() {
        while (true) {
            if(x % 2 == 0){
                // synchronized (this) {
                synchronized (SellTicketsSynchronizedFun.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()
                                + "正在出售第 " + (tickets--) + " 张票");
                    }
                }
            } else {
                sellTicket();
            }
            x++;
        }
    }

    /*
    // 同步方法
	 private synchronized void sellTicket() {
			if (tickets > 0) {
			try {
			    Thread.sleep(100);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
						+ "正在出售第 " + (tickets--) + " 张票 ");
			}
	}
	*/

    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "正在出售第 " + (tickets--) + " 张票");
        }
    }
}

class Tickets {
}
