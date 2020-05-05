package design_patterns.singleton;

/**
 * 单例模式：保证类在内存中只有一个对象。
 *
 * 如何保证类在内存中只有一个对象呢?
 * 		A：把构造方法私有
 * 		B：在成员位置自己创建一个对象
 * 		C:通过一个公共的方法提供访问
 *
 * 分类：
 *      饿汉式：Student
 *      懒汉式：Teacher
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class StudentApp {
	public static void main(String[] args) {
		// Student s1 = new Student();
		// Student s2 = new Student();
		// System.out.println(s1 == s2); // false，则创建了两个对象

        // 通过单例如何得到对象呢?

        // Student.stu = null;
        // Student s1 = Student.getStudent();
        // Student s2 = Student.getStudent();
        // System.out.println(s1 == s2); // true

        // System.out.println(s1); // null
        // System.out.println(s2); // null

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2); // true

		System.out.println(s1); // design_patterns.singleton.Student@61e717c2
		System.out.println(s2); // design_patterns.singleton.Student@61e717c2
	}
}
