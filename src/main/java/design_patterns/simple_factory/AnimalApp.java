package design_patterns.simple_factory;

/**
 * 简单工厂模式
 *
 * @author liushuai
 * @create 2020/5/4
 */
public class AnimalApp {
    public static void main(String[] args) {
        // 具体类调用
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        System.out.println("------------");

        // 工厂有了后，通过工厂制造
        // Dog dd = AnimalFactory.createDog();
        // Cat cc = AnimalFactory.createCat();
        // dd.eat();
        // cc.eat();
        // System.out.println("------------");

        // 工厂改进后
        Animal a = AnimalFactory.createAnimal("dog");
        a.eat();
        a = AnimalFactory.createAnimal("cat");
        a.eat();

        // NullPointerException
        a = AnimalFactory.createAnimal("pig");
        if (a != null) {
            a.eat();
        } else {
            System.out.println("对不起，暂时不提供这种动物");
        }
    }
}
