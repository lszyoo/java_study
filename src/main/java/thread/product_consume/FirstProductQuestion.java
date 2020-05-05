package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class FirstProductQuestion implements Runnable {
    private Student stu;

    public FirstProductQuestion(Student stu) {
        this.stu = stu;
    }

    @Override
    public void run() {
        // Student stu = new Student();
        stu.name = "林青霞";
        stu.age = 27;
    }
}
