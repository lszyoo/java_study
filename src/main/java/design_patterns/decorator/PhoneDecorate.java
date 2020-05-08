package design_patterns.decorator;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class PhoneDecorate implements Phone {
    private Phone p;

    public PhoneDecorate(Phone p) {
        this.p = p;
    }

    @Override
    public void call() {
        this.p.call();
    }
}
