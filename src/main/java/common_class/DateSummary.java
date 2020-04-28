package common_class;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date
 * DateFormat
 * SimpleDateFormat
 *
 */
public class DateSummary {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取当前系统时间
        String date = sdf.format(new Date());
        System.out.println(date);
        // 2020-03-03 21:22:38
    }
}
