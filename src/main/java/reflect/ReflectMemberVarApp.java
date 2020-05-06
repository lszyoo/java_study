package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 通过发生获取成员变量并使用
 *
 * @author liushuai
 * @create 2020/5/5
 */
public class ReflectMemberVarApp {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("reflect.Person");

        // 获取所有的成员变量
        // Field[] fields = c.getFields();  // 只能获取公共的
        Field[] fields = c.getDeclaredFields();   // 获取所有的
        for (Field field : fields) { System.out.println(field);
        }
        /*
           private java.lang.String reflect.Person.name
           int reflect.Person.age
           public java.lang.String reflect.Person.address
         */


        // 通过无参构造方法创建对象
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);    // Person [name=null, age=0, address=null]

        // 获取单个的成员变量
        // 获取address并对其赋值
        Field addressField = c.getField("address");
        // public void set(Object obj,Object value)
        // 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
        addressField.set(obj, "北京"); // 给obj对象的addressField字段设置值为"北京"
        System.out.println(obj);    // Person [name=null, age=0, address=北京]

        // 获取name并对其赋值
        // NoSuchFieldException
        Field nameField = c.getDeclaredField("name");
        // IllegalAccessException
        nameField.setAccessible(true);
        nameField.set(obj, "林青霞");
        System.out.println(obj);    // Person [name=林青霞, age=0, address=北京]

        // 获取age并对其赋值
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 27);
        System.out.println(obj);    // Person [name=林青霞, age=27, address=北京]
    }
}
