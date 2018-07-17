package function.construction;

// 新建一个 Person 类
public class Person {
    // 设置几个成员变量，访问权限全部设为 private
    private String name;
    private String sex;
    private int age;

    // 设置一个 Person 类的无参构造
    Person(){
        super();		// 子类的构造方法，默认调用父类的无参构造
    }
    // 再设置一个Person类的有参构造
    Person(String name,String sex,int age){
        super();		// 子类的构造方法，默认调用父类的无参构造
        // 将传过来的参数值分别赋给当前 Person 类的成员变量
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    // 在下面定义3个成员方法,分别是 eat  drink  sleep
    public void eat(){
        System.out.println("吃饭了");
    }
    public void drink(){
        System.out.println("喝水了");
    }
    public void sleep(){
        System.out.println("睡觉了");
    }
    // 定义 get 和 set 方法，分别对成员变量进行赋值和取值，供外部访问
    public void getName(){
        this.name=name;
    }
    public String setName(){
        return name;
    }
    public void getSex(){
        this.age=age;
    }
    public String setSex(){
        return sex;
    }
    public void getAge(){
        this.age=age;
    }
    public int setAge(){
        return age;
    }
    // 重写 toString 方法，如果不重写，那么输出的对象只有对象本身的地址值
    @Override
    public String toString() {
        return "Person [name = " + name + ", sex = " + sex + ", age = " + age + "]";
    }
}
