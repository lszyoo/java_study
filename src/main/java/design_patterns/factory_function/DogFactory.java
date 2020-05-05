package design_patterns.factory_function;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class DogFactory implements Factory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}
