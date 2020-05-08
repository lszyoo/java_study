package design_patterns.decorator;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("手机可以打电话了");
    }
}
