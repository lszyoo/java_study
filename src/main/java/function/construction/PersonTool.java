package function.construction;

import java.util.HashMap;
import java.util.Map;

// 创建一个 Tool 类，在类里面自定义一个方法 eat
public class PersonTool {
    public static void eat(String k, Person v){
        Map<String,Person> map = new HashMap<String,Person>();              // 创建Map的对象，用Map类来接收，key和value的数据类型分别设成String和Person
        map.put(k, v);										    // 将传过来的k和v值存入HashMap中
        System.out.println(k + " " + map.get(k));				// 调用get(Object k)方法，将制定键所对应的value值输出
    }
}
