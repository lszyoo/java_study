package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class FirstConsumeQuestion implements Runnable {
    private Student stu;

    public FirstConsumeQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        // Student stu = new Student();
        System.out.println(stu.name + "---" + stu.age);
    }
}
