package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 读取控制台的输入
 *
 * PrintStream 类的方法 println():
 *      System.out.println();
 */
public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        oneChar();
        moreChars();
    }

    // 注意：回车也算一个字符
    public static void oneChar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符，按 q 键结束。");
        char c;
        do {
            c = (char) br.read();
            System.out.println("你输入的字符为：" + c);
        } while (c != 'q');
    }

    public static void moreChars() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一行字符：");
        String str = br.readLine();
        System.out.println("你输入的字符为：" + str);
    }
}
