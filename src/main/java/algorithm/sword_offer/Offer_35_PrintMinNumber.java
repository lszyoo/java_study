package algorithm.sword_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中
 * 最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为 321323。
 */
public class Offer_35_PrintMinNumber {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 32;
        numbers[2] = 321;
        System.out.println(printMinNumber(numbers));
    }

    public static String printMinNumber(int[] numbers) {
        if(numbers == null || numbers.length == 0)
            return "";
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        for (int j:list) {
            s+=j;
        }
        return s;
    }
}
