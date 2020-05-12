package enumeration.direction_enum;

/**
 * @author liushuai
 * @create 2020/5/12
 */
public enum Direction2 {
    FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");

    private String name;

    // 默认 private，可省略
    private Direction2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     @Override
     public String toString() {
        return "我爱林青霞";
     }
}
