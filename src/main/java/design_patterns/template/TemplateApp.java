package design_patterns.template;

/**
 * 模板模式：应对多变的需求
 *
 * @author liushuai
 * @create 2020/5/8
 */
public class TemplateApp {
    public static void main(String[] args) {
        // GetTime gt = new GetTime();
        // System.out.println(gt.getTime() + "毫秒");

        GetTime gt = new ForDemo();
        System.out.println(gt.getTime() + "毫秒");

        gt = new IODemo();
        System.out.println(gt.getTime() + "毫秒");
    }
}
