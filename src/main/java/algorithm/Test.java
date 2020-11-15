package algorithm;

import datastruct.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public boolean strContains(String A, String B) {
        if (A == null || B == null) {
            return false;
        }

        if (A.length() == 0 || B.length() == 0) {
            return false;
        }

        int len = 0;
        for (int i = 0; i < A.length(); i++) {
            while (A.charAt(i) == B.charAt(len)) {
                len++;
                if (len == B.length()) {
                    return true;
                }
                i++;
            }

            len = 0;
        }

        return false;
    }

    public String ten2Three(int num) {
        if (num <= 0) {
            return "num 必须为非负";
        }

        LinkedList<String> list = new LinkedList<>();

        if (num >= 3) {
            int m = num % 3;
            if (m == 0) {
                list.add("a");
            }
            if (m == 1) {
                list.add("b");
            }
            if (m == 2) {
                list.add("c");
            }
            m = m / 3;
        } else {
            if (num == 1) {
                list.add("b");
            }
            if (num == 2) {
                list.add("c");
            }
        }

        List<String> resultList = new ArrayList<>();
        while (list.isEmpty()) {
            resultList.add(list.removeLast());
        }
        String result = resultList.toString();
        return result.substring(1, result.length() - 1).replaceAll(",", "");
    }

    public int find(int[] arr, int m) {
        if (arr.length == 0) {
            return -1;
        }

        int lo = 0;
        int hi = arr.length - 1;

        while (hi >= lo) {
            int mid = (hi + lo) / 2;
            if (m > arr[mid]) {
                lo = mid + 1;
            } else if (m < arr[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -2;
    }
}
