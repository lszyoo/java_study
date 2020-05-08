package design_patterns.decorator;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class MusicPhoneDecorate extends PhoneDecorate {
    public MusicPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("手机可以听音乐");
    }
}
