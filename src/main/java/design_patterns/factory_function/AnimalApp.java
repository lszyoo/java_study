package design_patterns.factory_function;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class AnimalApp {
	public static void main(String[] args) {
		// 需求：我要买只狗
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();    // 狗吃肉
		System.out.println("-------");

		// 需求：我要买只猫
		f = new CatFactory();
		a = f.createAnimal();
		a.eat();    // 猫吃鱼
	}
}
