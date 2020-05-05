package thread.die_lock;

/**
 * @author liushuai
 * @create 2020/5/3
 */
public class DieLock extends Thread {
    private boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    // 两个线程分别调用if、else，线程1用obj1等obj2，线程2用obj2等obj1
    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.obj1) {
                System.out.println("if obj1");
                synchronized (MyLock.obj2) {
                    System.out.println("if obj2");
                }
            }
        } else {
            synchronized (MyLock.obj2) {
                System.out.println("else obj2");
                synchronized (MyLock.obj1) {
                    System.out.println("else obj1");
                }
            }
        }
    }
}

class MyLock {
    // 创建两把锁对象
    public static final Object obj1 = new Object();
    public static final Object obj2 = new Object();
}
