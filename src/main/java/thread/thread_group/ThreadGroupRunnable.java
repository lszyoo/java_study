package thread.thread_group;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class ThreadGroupRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
