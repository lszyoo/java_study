package thread.product_consume;

/**
 * 最终版代码中：
 * 		把Student的成员变量给私有的了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class ForthQuestionApp {
    public static void main(String[] args) {
        //创建资源
        ForthStudent fs = new ForthStudent();

        //设置和获取的类
        ForthProductQuestion fpq = new ForthProductQuestion(fs);
        ForthConsumeQuestion fcq = new ForthConsumeQuestion(fs);

        //线程类
        Thread t1 = new Thread(fpq);
        Thread t2 = new Thread(fcq);

        //启动线程
        t1.start();
        t2.start();
    }
}
