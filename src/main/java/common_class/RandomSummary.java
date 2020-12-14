package common_class;

import java.math.BigDecimal;
import java.util.Random;

public class RandomSummary {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Random
         */
        // 以当前时间为种子
        Random random1 = new Random();
        // 自定义种子，同一个对象产生随机数相同，多个对象产生随机数不同
        Random random2 = new Random(100);

        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt(100) + "\t");
        }
        // 输出：50	47	39	32	46 ，多次执行不同结果，与当前时间有关

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(random2.nextInt(100) + "\t");
        }
        // 输出：15	50	74	88	91 ，多次执行同一个结果

        System.out.println();

        // random1.nextDouble() 取值 [0.0, 1.0)
        for (int i = 0; i < 5; i++) {
            System.out.print(new BigDecimal(random1.nextDouble() * 100).setScale(2, BigDecimal.ROUND_HALF_UP) + "\t");
        }
        // 输出：34.91	84.92	43.79	67.65	85.95

        System.out.println();

        /**
         * Math.random() 取值[0.0, 1.0)
         */
        for (int i = 0; i < 5; i++) {
            // 放到 for 循环外边，产生的随机数相同，但是产生了多个对象
            double random3 = Math.random();
            System.out.print(new BigDecimal(random3 * 100).setScale(2, BigDecimal.ROUND_HALF_UP) + "\t");
        }
        // 输出：39.81	39.13	64.41	49.73	57.69
    }
}
