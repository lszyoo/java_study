package design_patterns.singleton;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class Student {
    // 为保证类在内存中只有一个对象，需要构造私有
	private Student() {
	}

    // 自己造一个对象
    // 静态方法只能访问静态成员变量，加静态
    // static Student stu = new Student();
    // 为了不让外界直接访问修改这个值，加 private
    private static Student stu = new Student();

    // 提供公共的访问方式
    // 为了保证外界能够直接使用该方法，加静态
    public static Student getStudent() {
        return stu;
    }
}
