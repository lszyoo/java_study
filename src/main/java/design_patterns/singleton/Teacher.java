package design_patterns.singleton;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3三个线程同时进来可能会造成多次创建对象
		if (t == null) {
			// t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
