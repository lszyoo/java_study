package utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * ASCII，GBK，UTF-8对数字和英文字母的编码相同，unicode的编码跟前面三项都不同
 *
 * public String(byte bytes[], Charset charset) 将指定编码的byte数组转化为对应编码的字符串
 */
public class Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));
        // 系统默认编码：UTF-8

        System.out.println("系统默认字符编码：" + Charset.defaultCharset());
        // 系统默认字符编码：UTF-8

        System.out.println("系统默认语言：" + System.getProperty("user.language"));
        // 系统默认语言：zh

        // 定义字符串包含数字和中文
        String t = "hello, 大家好！";

        // 通过getBytes方法获取默认的编码
        System.out.println("默认编码格式：");
        byte[] b = t.getBytes();
        // 打印默认编码
        for(byte a : b)
            System.out.print(a + ",");  // 104,101,108,108,111,44,32,-27,-92,-89,-27,-82,-74,-27,-91,-67,-17,-68,-127,
        System.out.println();
        System.out.println(new String(b));  // hello, 大家好！

        // 打印GBK编码
        System.out.println("GBK编码格式");
        b = t.getBytes("GBK");
        for(byte a : b)
            System.out.print(a + ",");  // 104,101,108,108,111,44,32,-76,-13,-68,-46,-70,-61,-93,-95,
        System.out.println();
        System.out.println(new String(b));  // hello, ��Һã�

        // 打印UTF-8编码
        System.out.println("UTF-8编码格式");
        b = t.getBytes("UTF-8");
        for(byte a : b)
            System.out.print(a + ",");  // 104,101,108,108,111,44,32,-27,-92,-89,-27,-82,-74,-27,-91,-67,-17,-68,-127,
        System.out.println();
        System.out.println(new String(b));  // hello, 大家好！

        // 打印ASCII编码
        System.out.println("ASCII编码格式");
        b = t.getBytes("ASCII");
        for(byte a : b)
            System.out.print(a + ",");  // 104,101,108,108,111,44,32,63,63,63,63,
        System.out.println();
        System.out.println(new String(b));  // hello, ????

        //打印UNICODE编码
        System.out.println("UNICODE编码格式");
        b = t.getBytes("UNICODE");
        for(byte a : b)
            System.out.print(a + ",");  // -2,-1,0,104,0,101,0,108,0,108,0,111,0,44,0,32,89,39,91,-74,89,125,-1,1,
        System.out.println();
        System.out.println(new String(b));  // �� h e l l o ,  Y'[�Y}�
    }
}
