package common_class;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberRound {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        System.out.println(3 * 1.0 / 7);
        // 输出：0.42857142857142855

        // 四舍五入，保留两位小数，百分数
        System.out.println(String.format("%.2f", (float) num1 / (float) num2 * 100) + "%");    // 输出：42.86%
        System.out.println(String.format("%.2f", (float) num1 / (float) num2));                // 输出：0.43


        // 四舍五入，保留两位小数，百分数，利用 DecimalFormat 转换
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format((float) num1 / (float) num2 * 100) + "%");   // 输出：42.86%
        System.out.println(df.format((float) num1 / (float) num2));               // 输出：.43


        // 四舍五入，保留两位小数，百分数。利用 NumberFormat 类
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float) num1 / (float) num2 * 100);
        System.out.println(result + "%");
        // 输出：42.86%


        // 四舍五入，保留两位小数，百分数，利用 Math 包 round 方法
        System.out.println((double) Math.round((double) num1 / (double) num2 * 10000) / 100 + "%");
        // 输出：42.86%


        // 四舍五入，保留两位小数，利用 BigDecimal
        BigDecimal bg1 = new BigDecimal((float) num1 / (float) num2 * 100).setScale(3, BigDecimal.ROUND_HALF_UP);
        BigDecimal bg2 = new BigDecimal((float) num1 / (float) num2 * 100).setScale(3, RoundingMode.HALF_UP);
        System.out.println(bg1.toString() + "%");   // 输出：42.857%
        System.out.println(bg2.toString() + "%");   // 输出：42.857%
    }
}
