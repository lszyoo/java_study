package design_patterns.decorator.person_find_clothes;

/**
 * 测试类，看一下你就会发现，跟java的I/O操作有多么相似
 * @author liushuai
 * @create 2020/5/1
 */
public class Test {
    public static void main(String[] args) {
        Human human = new Person();
        HumanDecorator decorator = new HumanDecoratorThird(new HumanDecoratorSecond(new HumanDecoratorFirst(human)));
        decorator.wearClothes();
        decorator.walkToWhere();
        /*
           输出：
                穿什么呢。
                进房子。
                去衣柜找找看。
                找到一件D&G。
                去哪里呢。
                书房找找Map。
                在Map上找找。
                在Map上找到神秘花园和城堡。
         */
    }
}
