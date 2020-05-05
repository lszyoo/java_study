package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class ThirdProductQuestion implements Runnable {
    private Student stu;
    private int x = 0;

    public ThirdProductQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stu) {
                // 判断有没有
                if(stu.flag){
                    try {
                        stu.wait();  // t1等着，释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x % 2 == 0) {
                    stu.name = "林青霞";
                    stu.age = 27;
                } else {
                    stu.name = "刘意";
                    stu.age = 30;
                }
                x++; // x = 1

                // 修改标记
                stu.flag = true;
                // 唤醒线程
                stu.notify();  // 唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU的执行权。
            }
            // t1有锁，或者t2有锁
        }
    }
}
