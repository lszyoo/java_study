package new_features.eight;

/**
 * lambda 表达式替换匿名内部类、线程
 *
 * @author liushuai
 * @create 2020/5/17
 */
public class Lambda4AnonymousInnerClass {
    public static void main(String[] args) {
        // 1.1 使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }).start();
        // Hello world

        // 1.2 使用 lambda expression
        new Thread(() -> System.out.println("Hello world")).start();
        // Hello world


        // 2.1 使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };

        // 2.2 使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world");

        // 直接调用 run 方法
        race1.run();    // Hello world
        race2.run();    // Hello world
    }
}
