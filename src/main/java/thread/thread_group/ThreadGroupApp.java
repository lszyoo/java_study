package thread.thread_group;

/**
 * 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class ThreadGroupApp {
    public static void main(String[] args) {
         method1();

        /*
            设置线程组：
                （1）创建一个线程组
                （2）创建其他线程的时候，把其他线程的组指定为我们自己新建线程组
         */
        method2();
    }

    private static void method2() {
        // ThreadGroup(String name)
        ThreadGroup tg = new ThreadGroup("新建线程组");

        ThreadGroupRunnable tgr = new ThreadGroupRunnable();
        // Thread(ThreadGroup group, Runnable target, String name)
        Thread t1 = new Thread(tg, tgr, "林青霞");
        Thread t2 = new Thread(tg, tgr, "刘意");

        System.out.println(t1.getThreadGroup().getName());  // 新建线程组
        System.out.println(t2.getThreadGroup().getName());  // 新建线程组

        //通过组名称设置后台线程，表示该组的线程都是后台线程
        tg.setDaemon(true);
    }

    private static void method1() {
        ThreadGroupRunnable tgr = new ThreadGroupRunnable();
        Thread t1 = new Thread(tgr, "林青霞");
        Thread t2 = new Thread(tgr, "刘意");

        // 线程类里面的方法：public final ThreadGroup getThreadGroup()
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();

        // 线程组里面的方法：public final String getName()
        String name1 = tg1.getName();
        String name2 = tg2.getName();
        System.out.println(name1);  // main
        System.out.println(name2);  // main

        // 通过结果我们知道了：线程默认情况下属于main线程组
        System.out.println(Thread.currentThread().getThreadGroup().getName());  // main
    }
}
