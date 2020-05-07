package reflect.reflect_config;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 通过配置文件运行类中的方法
 *
 * 反射：
 * 		需要有配置文件配合使用。
 * 		用config.txt代替。
 * 		并且你知道有两个键。
 * 			className
 * 			methodName
 * @author liushuai
 * @create 2020/5/7
 */
public class App {
    public static void main(String[] args) throws Exception {
        // 反射前的做法
        // Student s = new Student();
        // s.love();
        // Teacher t = new Teacher();
        // t.love();
        // Worker w = new Worker();
        // w.love();


        // 反射后的做法
        // 加载键值对数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("F:\\code\\java_study\\src\\main\\java\\reflect\\reflect_config\\config.txt");
        prop.load(fr);
        fr.close();

        // 获取数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        // 反射
        Class c = Class.forName(className);

        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        // 调用方法
        Method m = c.getMethod(methodName);
        m.invoke(obj);
        // 爱生活,爱Java
    }
}
