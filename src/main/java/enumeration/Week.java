package enumeration;

/**
 * 向枚举中添加新方法
 */
public enum Week {
    MONDAY("周一", 1), TUESDAT("周二", 2), WENDSDAY("周三", 3);
    // 成员变量
    private String name;
    private int index;
    // 构造方法
    private Week(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // set、get 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    // 重写方法
    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    // 普通方法
    private static String getName(int index) {
        for (Week week : Week.values()) {
            if (week.getIndex() == index) {
                return week.name;
            }
        }
        return null;
    }
}
