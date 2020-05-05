package design_patterns.decorator.person_find_clothes;

/**
 * 定义装饰者
 * @author liushuai
 * @create 2020/4/29
 */
public abstract class HumanDecorator implements Human {
    private Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
