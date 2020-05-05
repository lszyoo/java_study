package design_patterns.factory_function;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class CatFactory implements Factory {
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
