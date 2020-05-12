package new_features.seven;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * try(必须是java.lang.AutoCloseable的子类对象){…}
 * 好处：
 *      资源自动释放，不需要close()了
 *      把需要关闭资源的部分都定义在这里就ok了
 *      主要是流体系的对象是这个接口的子类(看JDK7的API)
 *
 * @author liushuai
 * @create 2020/5/12
 */
public class TryWithResources {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("a.txt");
             FileWriter fw = new FileWriter("b.txt")) {
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
