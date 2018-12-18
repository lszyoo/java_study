package enumeration;

/**
 * 枚举类实现接口
 */
interface Behaviour {
    void print();
    String getInfo();
}

public enum Classmate implements Behaviour {
    STUDENT("小明", 18), TEACHER("郭老师",35);
    // 成员变量
    private String name;
    private int age;
    // 构造方法
    private Classmate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 接口方法
    @Override
    public void print() {
        System.out.println(this.name + ":" + this.age);
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
