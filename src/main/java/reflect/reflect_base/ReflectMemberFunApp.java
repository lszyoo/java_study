package reflect.reflect_base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author liushuai
 * @create 2020/5/6
 */
public class ReflectMemberFunApp {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("reflect.reflect_base.Person");

        // 获取所有的方法
        Method[] methods = c.getMethods();  // 获取自己的包括父亲的公共方法
        for (Method method : methods) {
            System.out.println(method);
        }
        /*
            public java.lang.String reflect.reflect_base.Person.toString()
            public void reflect.reflect_base.Person.method(java.lang.String)
            public void reflect.reflect_base.Person.show()
            public java.lang.String reflect.reflect_base.Person.getString(java.lang.String,int)
            public final void java.lang.Object.wait() throws java.lang.InterruptedException
            public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
            public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
            public boolean java.lang.Object.equals(java.lang.Object)
            public native int java.lang.Object.hashCode()
            public final native java.lang.Class java.lang.Object.getClass()
            public final native void java.lang.Object.notify()
            public final native void java.lang.Object.notifyAll()
         */

        Method[] methods1 = c.getDeclaredMethods(); // 获取自己的所有的方法
        for (Method method : methods1) {
            System.out.println(method);
        }
        /*
            public java.lang.String reflect.reflect_base.Person.toString()
            private void reflect.reflect_base.Person.function()
            public void reflect.reflect_base.Person.method(java.lang.String)
            public void reflect.reflect_base.Person.show()
            public java.lang.String reflect.reflect_base.Person.getString(java.lang.String,int)
         */


        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        // 获取单个方法并使用
        // public Method getMethod(String name,Class<?>... parameterTypes)
        // 第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
        Method m1 = c.getMethod("show");
        // public Object invoke(Object obj,Object... args)
        // 返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数
        m1.invoke(obj);     // 调用obj对象的m1方法
        // show

        // public void method(String s)
        Method m2 = c.getMethod("method", String.class);
        m2.invoke(obj, "hello");
        // method hello

        // public String getString(String s, int i)
        Method m3 = c.getMethod("getString", String.class, int.class);
        Object objString = m3.invoke(obj, "hello", 100);
        System.out.println(objString);
        // hello---100
        String s = (String)m3.invoke(obj, "hello",100);
        System.out.println(s);
        // hello---100

        // private void function()
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
        // function
    }
}
