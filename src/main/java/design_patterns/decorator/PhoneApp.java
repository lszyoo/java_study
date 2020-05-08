package design_patterns.decorator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 装饰设计模式
 *
 * @author liushuai
 * @create 2020/5/8
 */
public class PhoneApp {
    public static void main(String[] args) {
        Phone p = new IPhone();
        p.call();
        // 手机可以打电话了

        // 需求：我想在接电话前，听彩铃，一层装饰
        PhoneDecorate pd = new RingPhoneDecorate(p);
        pd.call();
        /*
            手机可以听彩铃
            手机可以打电话了
         */

        // 需求：我想在接电话后，听音乐，一层装饰
        pd = new MusicPhoneDecorate(p);
        pd.call();
        /*
            手机可以打电话了
            手机可以听音乐
         */


        // 需求：我要想手机在接前听彩铃，接后听音乐
        // 自己提供装饰类，在打电话前听彩铃，打电话后听音乐
        pd = new RingPhoneDecorate(new MusicPhoneDecorate(p));
        pd.call();
        /*
            手机可以听彩铃
            手机可以打电话了
            手机可以听音乐
         */

        // 装饰设计模式在IO流中的使用
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        Scanner sc = new Scanner(System.in);
    }
}
