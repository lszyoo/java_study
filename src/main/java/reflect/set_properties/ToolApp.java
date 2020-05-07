package reflect.set_properties;

/**
 * @author liushuai
 * @create 2020/5/7
 */
public class ToolApp {
    public static void main(String[] args) throws NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        Person p = new Person();
        Tool t = new Tool();
        t.setProperty(p, "name", "林青霞");
        t.setProperty(p, "age", 27);
        System.out.println(p);
        // 林青霞---27
    }
}
