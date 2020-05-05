package thread.die_lock;

/**
 * 同步弊端：
 *      （1）效率低
 *      （2）如果出现了同步嵌套，就容易产生死锁问题
 *
 * 死锁：
 *      是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
 *
 * 举例：
 * 		中国人，美国人吃饭案例。
 * 		正常情况：
 * 			中国人:筷子两支
 * 			美国人:刀和叉
 * 		现在：
 * 			中国人：筷子1支，刀一把
 * 			美国人：筷子1支，叉一把
 *
 * @author liushuai
 * @create 2020/5/3
 */
public class DieLockApp {
    public static void main(String[] args) {
        DieLock dl1 = new DieLock(true);
        DieLock dl2 = new DieLock(false);

        dl1.start();
        dl2.start();
    }
}
