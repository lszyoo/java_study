package reflect.agent;

import java.lang.reflect.Proxy;

/**
 * 代理及中介
 * 不用每次都要修改代码
 *
 * @author liushuai
 * @create 2020/5/8
 */
public class AgentApp {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        ud.add();       // 添加功能
        ud.delete();    // 删除功能
        ud.update();    // 修改功能
        ud.find();      // 查找功能
        System.out.println("-----------");

        /*
            我们要创建一个动态代理对象
            Proxy类中有一个方法可以创建动态代理对象
            ClassLoader 为类加载器
            public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
            我准备对ud对象做一个代理对象
         */
        MyInvocationHandler handler = new MyInvocationHandler(ud);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
        System.out.println("-----------");
        /*
            权限校验
            添加功能
            日志记录
            权限校验
            删除功能
            日志记录
            权限校验
            修改功能
            日志记录
            权限校验
            查找功能
            日志记录
         */

        StudentDao sd = new StudentDaoImpl();
        MyInvocationHandler handler2 = new MyInvocationHandler(sd);
        StudentDao proxy2 = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass().getInterfaces(), handler2);
        proxy2.login();
        proxy2.regist();
        /*
            权限校验
            登录功能
            日志记录
            权限校验
            注册功能
            日志记录
         */
    }
}
