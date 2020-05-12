package enumeration.direction_enum;

/**
 * 定义枚举类要用关键字enum
 * 所有枚举类都是Enum的子类
 * 枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略
 * 枚举类可以有构造器，但必须是private的，它默认的也是private的。枚举项的用法比较特殊：枚举(“”);
 * 枚举类也可以有抽象方法，但是枚举项必须重写该方法
 * 枚举在switch语句中的使用
 *
 * @author liushuai
 * @create 2020/5/12
 */
public class DirectionApp {
    public static void main(String[] args) {
        Direction1 d = Direction1.FRONT;
        // public String toString()返回枚举常量的名称，它包含在声明中。
        System.out.println(d);  // FRONT
        System.out.println("-------------");
        Direction2 d2 = Direction2.FRONT;
        System.out.println(d2); // 我爱林青霞
        System.out.println(d2.getName());   // 前
        System.out.println("-------------");
        Direction3 d3 = Direction3.FRONT;
        System.out.println(d3); // FRONT
        System.out.println(d3.getName());   // 前
        d3.show();  // 前
        System.out.println("--------------");

        Direction3 dd = Direction3.FRONT;
        switch (dd) {
            case FRONT:
                System.out.println("你选择了前");
                break;
            case BEHIND:
                System.out.println("你选择了后");
                break;
            case LEFT:
                System.out.println("你选择了左");
                break;
            case RIGHT:
                System.out.println("你选择了右");
                break;
        }
        // 你选择了前
    }
}
