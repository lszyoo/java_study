package design_patterns.decorator.person_find_clothes;

/**
 * @author liushuai
 * @create 2020/4/30
 */
public class HumanDecoratorThird extends HumanDecorator {
    public HumanDecoratorThird(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件D&G。");
    }

    public void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        // TODO Auto-generated method stub
        super.walkToWhere();
        findTheTarget();
    }
}