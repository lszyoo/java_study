package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class SecondConsumeQuestion implements Runnable {
    private Student stu;

    public SecondConsumeQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stu) {
                System.out.println(stu.name + "---" + stu.age);
            }
        }
    }
}
