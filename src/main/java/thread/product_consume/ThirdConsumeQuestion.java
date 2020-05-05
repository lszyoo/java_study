package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class ThirdConsumeQuestion implements Runnable {
    private Student stu;

    public ThirdConsumeQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stu) {
                if(!stu.flag){
                    try {
                        stu.wait(); // t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来的时候
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(stu.name + "---" + stu.age);
                // 林青霞---27
                // 刘意---30

                // 修改标记
                stu.flag = false;
                // 唤醒线程
                stu.notify(); // 唤醒t1
            }
        }
    }
}
