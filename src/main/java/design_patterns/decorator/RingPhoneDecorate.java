package design_patterns.decorator;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class RingPhoneDecorate extends PhoneDecorate {
    public RingPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        System.out.println("手机可以听彩铃");
        super.call();
    }
}
