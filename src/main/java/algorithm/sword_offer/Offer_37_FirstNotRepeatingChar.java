package algorithm.sword_offer;

import java.util.HashMap;

/**
 * 字符串中第一个只出现了一次的字符
 */
public class Offer_37_FirstNotRepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstNotRepeatingChar("abcabdc"));
    }

    public static Character firstNotRepeatingChar(String str) {
        if(str.length() == 0) {
            return null;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i), ++time);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int j=0; j < str.length(); j++) {
            if(map.get(str.charAt(j)).equals(1))
                return str.charAt(j);
        }

        return null;
    }
}
