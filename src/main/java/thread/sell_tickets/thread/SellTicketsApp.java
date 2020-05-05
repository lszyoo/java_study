package thread.sell_tickets.thread;

/**
 *
 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 * @author liushuai
 * @create 2020/5/3
 */
public class SellTicketsApp {
    public static void main(String[] args) {
        // 创建三个线程对象
        SellTicketsThread st1 = new SellTicketsThread();
        SellTicketsThread st2 = new SellTicketsThread();
        SellTicketsThread st3 = new SellTicketsThread();

        // 给线程对象起名字
        st1.setName("窗口 1");
        st2.setName("窗口 2");
        st3.setName("窗口 3");

        // 启动线程
        st1.start();
        st2.start();
        st3.start();
    }
}
