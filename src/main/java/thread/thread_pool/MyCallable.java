package thread.thread_pool;

import java.util.concurrent.Callable;

/**
 * 线程求和案例
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int x = 1; x <= number; x++) {
            sum += x;
        }
        return sum;
    }
}
