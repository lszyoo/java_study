package enumeration.direction_enum;

/**
 * 枚举类方法
 *
 * @author liushuai
 * @create 2020/5/12
 */
public class EnumMethodApp {
    public static void main(String[] args) {
        // int compareTo(E o)，枚举值有索引，返回索引差值
        Direction2 d21 = Direction2.FRONT;
        Direction2 d22 = Direction2.BEHIND;
        Direction2 d23 = Direction2.LEFT;
        Direction2 d24 = Direction2.RIGHT;
        System.out.println(d21.compareTo(d21)); // 0
        System.out.println(d21.compareTo(d24)); // 3
        System.out.println(d24.compareTo(d21)); // -3
        System.out.println("---------------");

        // String name()
        System.out.println(d21.name()); // FRONT
        System.out.println(d22.name()); // BEHIND
        System.out.println(d23.name()); // LEFT
        System.out.println(d24.name()); // RIGHT
        System.out.println("--------------");

        // int ordinal()，返回索引号
        System.out.println(d21.ordinal());  // 0
        System.out.println(d22.ordinal());  // 1
        System.out.println(d23.ordinal());  // 2
        System.out.println(d24.ordinal());  // 3
        System.out.println("--------------");

        // String toString()
        System.out.println(d21.toString()); // 我爱林青霞(FRONT)
        System.out.println(d22.toString()); // 我爱林青霞(BEHIND)
        System.out.println(d23.toString()); // 我爱林青霞(LEFT)
        System.out.println(d24.toString()); // 我爱林青霞(RIGHT)
        System.out.println("--------------");

        // <T> T valueOf(Class<T> type,String name)
        Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
        System.out.println(d.getName());    // 前
        System.out.println("----------------");

        // values()
        // 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
        Direction2[] dirs = Direction2.values();
        for (Direction2 d2 : dirs) {
            System.out.println(d2);
            System.out.println(d2.getName());
        }
        /*
            我爱林青霞(FRONT)
            前
            我爱林青霞(BEHIND)
            后
            我爱林青霞(LEFT)
            左
            我爱林青霞(RIGHT)
            右
         */
    }
}
