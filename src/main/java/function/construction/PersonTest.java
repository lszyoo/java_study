package function.construction;

public class PersonTest {
    public static void main(String[] args){
        // 创建5个Person类的有参对象，分别对成员变量赋值
        Person p1 = new Person("王二", "男", 20);
        Person p2 = new Person("张三", "男", 22);
        Person p3 = new Person("李四", "男", 25);
        Person p4 = new Person("陈五", "男", 28);
        Person p5 = new Person("朱六", "男", 30);

        // 由于Tool类中的eat方法是静态的，所以直接用类名.方法名调用，在()中写上实际参数值，让eat方法的形式参数k、v接收
        PersonTool.eat("001", p1);
        PersonTool.eat("002", p2);
        PersonTool.eat("003", p3);
        PersonTool.eat("004", p4);
        PersonTool.eat("005", p5);
    }
}
