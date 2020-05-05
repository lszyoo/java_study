package design_patterns.decorator.person_find_clothes;

/**
 * @author liushuai
 * @create 2020/4/30
 */
public class HumanDecoratorSecond extends HumanDecorator {
    public HumanDecoratorSecond(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看。");
    }

    public void findPlaceOnMap() {
        System.out.println("在Map上找找。");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        // TODO Auto-generated method stub
        super.walkToWhere();
        findPlaceOnMap();
    }
}
