package reflect.set_properties;

import java.lang.reflect.Field;

/**
 * 写一个方法：
 *      public void setProperty(Object obj, String propertyName, Object value){}
 *      此方法可将obj对象中名为propertyName的属性的值设置为value
 *
 * @author liushuai
 * @create 2020/5/7
 */
public class Tool {
    public void setProperty(Object obj, String propertyName, Object value)
            throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        // 根据对象获取字节码文件对象
        Class c = obj.getClass();
        // 获取该对象的propertyName成员变量
        Field field = c.getDeclaredField(propertyName);
        // 取消访问检查
        field.setAccessible(true);
        // 给对象的成员变量赋值为指定的值
        field.set(obj, value);
    }
}
