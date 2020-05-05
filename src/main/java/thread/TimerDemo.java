package thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer：定时
 * 		public Timer()
 * 		public void schedule(TimerTask task, long delay)
 * 		public void schedule(TimerTask task, long delay, long period)
 * 	    public void schedule(TimerTask task, Date time)
 * 	    public void schedule(TimerTask task, Date firstTime, long period)
 * 		public void cancel()
 * TimerTask:任务
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class TimerDemo {
    public static void main(String[] args) {
        // 创建定时器对象
        Timer timer = new Timer();

        // 3秒后执行爆炸任务，结束任务
        timer.schedule(new MyTask1(timer), 3000);

        // 3秒后执行爆炸任务，然后每隔2秒执行爆炸任务
        timer.schedule(new MyTask2(), 3000, 2000);
    }
}

// 做一个任务
class MyTask1 extends TimerTask {

    private Timer timer;

    public MyTask1(){}

    public MyTask1(Timer timer){
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("轰隆隆，爆炸了！");
        timer.cancel();
    }

}

class MyTask2 extends TimerTask {
    @Override
    public void run() {
        System.out.println("轰隆隆，爆炸了！");
    }
}