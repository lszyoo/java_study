package algorithm.sword_offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Offer_3_PrintFromTailToHead {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        List<Integer> list = printFromTailToHead(node1);
        for (Integer integer : list) {
            System.out.print(integer + ",");
        }
        // 输出：6,2,5,1,
    }

    public static List<Integer> printFromTailToHead(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }

    // 定义一个链表的节点
    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

}
