package new_features.eight;

/**
 * lambda 表达式变量：
 * lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
 * lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
 * 在 lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
 *
 * @author liushuai
 * @create 2020/5/17
 */
public class Lambda2Var {
    final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = new GreetingService() {
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        };
        greetService1.sayMessage(salutation + "Runoob");
        // 输出：Hello! Runoob

        // 创建子类对象
        GreetingService greetService2 = message -> System.out.println(salutation + message); // 不打印，方法没调用
        greetService2.sayMessage("Runoob");
        // 子类调方法打印 Hello! Runoob
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
