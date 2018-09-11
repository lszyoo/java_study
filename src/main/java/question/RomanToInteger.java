package question;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str == null || str.length() == 0)
            System.out.println(-1);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = str.length();
        int result = map.get(str.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(str.charAt(i)) > map.get(str.charAt(i + 1)))
                result += map.get(str.charAt(i));
            else
                result -= map.get(str.charAt(i));
        }
    }
}

