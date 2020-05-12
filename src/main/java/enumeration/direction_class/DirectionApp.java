package enumeration.direction_class;

/**
 * @author liushuai
 * @create 2020/5/11
 */
public class DirectionApp {
    public static void main(String[] args) {
        Direction1 d = Direction1.FRONT;
        System.out.println(d);  // enumeration.direction_class.Direction1@61e717c2
        System.out.println("------------------------------------");
        Direction2 d2 = Direction2.FRONT;
        System.out.println(d2); // enumeration.direction_class.Direction2@66cd51c3
        System.out.println(d2.getName());   // 前
        System.out.println("------------------------------------");
        Direction3 d3 = Direction3.FRONT;
        System.out.println(d3); // enumeration.direction_class.Direction3$1@4dcbadb4
        System.out.println(d3.getName());   // 前
        d3.show();  // 前
    }
}
