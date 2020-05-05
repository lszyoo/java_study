package design_patterns.simple_factory;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class AnimalFactory {
    private AnimalFactory() {
    }

    // public static Dog createDog() {
    // return new Dog();
    // }
    //
    // public static Cat createCat() {
    // return new Cat();
    // }

    public static Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else {
            return null;
        }
    }
}
