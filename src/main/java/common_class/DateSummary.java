package common_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Date
 * DateFormat
 * SimpleDateFormat
 *
 */
public class DateSummary {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 获取当前系统时间
        Date date = new Date();

        System.out.println(date);
        // Sun Nov 15 16:35:47 CST 2020

        System.out.println(date.getTime());
        // 1605429347833

        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        // 2020-11-15 16:35:47


        // 指定时区
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));       // 设置时区为东八区
        System.out.println("东八区的时间：" + sdf.format(date));   // 输出格式化日期
        // 东八区的时间：2020-11-15 16:41:45


        // 将时间转换成时间戳
        Date dt = sdf.parse("2020-11-15 16:41:45");
        long timestamp = dt.getTime();
        System.out.println(timestamp);
        // 1605429705000

        // 将时间戳转换成时间
        Date dateTimestamp = new Date(1605429347833L);
        System.out.println(sdf.format(dateTimestamp));
        // 2020-11-15 16:35:47
    }
}
