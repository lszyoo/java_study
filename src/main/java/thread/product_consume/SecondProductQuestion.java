package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class SecondProductQuestion implements Runnable {
    private Student stu;
    private int x = 0;

    public SecondProductQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stu) {
                if (x % 2 == 0) {
                    stu.name = "林青霞"; // 刚走到这里，就被别人抢到了执行权
                    stu.age = 27;
                } else {
                    stu.name = "刘意";  // 刚走到这里，就被别人抢到了执行权
                    stu.age = 30;
                }
                x++;
            }
        }
    }
}
