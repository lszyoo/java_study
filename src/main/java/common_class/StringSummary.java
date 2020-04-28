package common_class;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/**
 * @author liushuai
 * @create 2020-04-27
 */
public class StringSummary {
    public static void main(String[] args) {
        /**
         * byte 字节流与中文互转
         */
        byte[] bytes = "月".getBytes();
        for (byte b : bytes) {
            System.out.print(b + ", ");     // -26, -100, -120
        }

        System.out.println(new String(bytes, Charset.forName("utf-8")));    // 月

        try {
            System.out.println(new String(bytes, "utf-8"));     // 月
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
