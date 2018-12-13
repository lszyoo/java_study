package on_coampus_recruitment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        test(str);
    }

    public static void test(String str) {
        if (str.length() < 2 || str.length() > 15)
            return;
//            System.out.println("×Ö·û´®³¤¶È²»Ð¡ÓÚ 2");

//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            map.put(str.charAt(i), i);
//        }

        int i = 0;

        StringBuilder builder1 = new StringBuilder();
        builder1.append(str.charAt(i));

        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) <= str.charAt(j)) {
                builder1.append(str.charAt(j));
                System.out.println(builder1.toString());
                builder1.deleteCharAt(builder1.toString().length() - 1);
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(i) < str.charAt(j) && str.charAt(j) < str.charAt(k)) {
                        builder1.append(str.charAt(j)).append(str.charAt(k));
                        System.out.println(builder1.toString());
                        builder1.deleteCharAt(builder1.toString().length() - 1).deleteCharAt(builder1.toString().length() - 2);
//                        for (int l = k + 1; l < str.length() + 1; l++) {
//                            if (str.charAt(k) < str.charAt(l)) {
//                                builder1.append(str.charAt(j)).append(str.charAt(k)).append(str.charAt(l));
//                                System.out.println(builder1.toString());
//                                builder1.deleteCharAt(builder1.toString().length() - 1).deleteCharAt(builder1.toString().length() - 2).deleteCharAt(builder1.toString().length() - 3);
//                            }
//                        }
                    }
                }
            }
        }

//        StringBuilder builder = new StringBuilder(str.charAt(i));
//        for (int j = i; j < str.length() - 1; j++) {
//            if (str.charAt(j) <= str.charAt(j + 1)) {
//                builder.append(str.charAt(j));
//            }
//        }
//
//        String str1 = builder.toString();
//        if (str1.length() >= 2) {
//            for (int j = 1; j < str1.length(); j++) {
//                System.out.println(str1.substring(0, j + 1));
//            }
//        }

        i++;
        if (i < str.length()) {
            test(str.substring(i, str.length()));
        }
    }

//    public static void test1(StringBuilder builder, String str, int i) {
//        for (int j = i + 1; j < str.length(); j++) {
//            if (str.charAt(i) <= str.charAt(j)) {
//                builder.append(str.charAt(j));
//                System.out.println(builder.toString());
//                builder.deleteCharAt(str.charAt(i));
//                if (i < str.length()) {
//
//                }
//            }
//        }
//    }
}