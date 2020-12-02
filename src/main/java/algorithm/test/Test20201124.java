package algorithm.test;

import datastruct.LinkList;

import java.util.*;

public class Test20201124 {
    // 奇偶链表
    public Node oddEvenList(Node head) {
        Node nodeTmp = head;

        Node node = head.next;
        Node nodeNext = node;
        while (node != null && node.next != null) {
            head.next = head.next.next;
            head.next = head;

            node.next = node.next.next;
            node.next = node;
        }
        head.next = nodeNext;
        return nodeTmp;
    }

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

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("a");
        boolean flag2 = set.add("a");
        System.out.println(flag1 + " -- " + flag2);


        Map<String, String> map = new HashMap<>();
        map.put("1", "");
        map.put("2", "2");
        map.put("3", null);
        System.out.println(map);

        int[][] arr = new int[2][4];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[0][3] = 3;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 2;
        arr[1][3] = 3;
        System.out.println(arr.length);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[j][k] + "\t");
            }
            System.out.println();
        }
        System.out.println(arr[0].length);
        System.out.println(arr.length);
    }

    class Node {
        Node next;
        int data;
        public Node (int data) {
            this.data = data;
        }
    }
}
