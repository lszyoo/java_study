package leetcode;

import com.sun.javafx.scene.control.skin.LabeledImpl;

/**
 * 数据在机器存储为 342，但在列表中逆向存储为 2->4->3
 * 给出两个链表，求两数之和，并以链表的方式返回
 *
 * 输入：(2->4->3) + (5->6->4)
 * 输出：7->0->8
 * 说明：342 + 465 = 708
 */
public class TwoLinkedSum {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        ListNode l1 = new ListNode(8, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(l1, l2));
        System.out.println(System.currentTimeMillis());
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode (int x) {
            val = x;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
//        while (node1.next != null || node2.next != null) {
//            if (node1.next == null) {
//                node1.next = new ListNode(0);
//            } else if (node2.next == null) {
//                node2.next = new ListNode(0);
//            }
//            node1 = node1.next;
//            node2 = node2.next;
//        }

//        node1 = l1;
//        node2 = l2;

        ListNode result = new ListNode(0);
        ListNode head = result;

        int carry = 0;
        while (node1 != null) {
            int x = node1.val + node2.val + carry;
            if (x >= 10) {
                carry = 1;
                x %= 10;
            } else {
                carry = 0;
            }
            result.next = new ListNode(x);
            result = result.next;
            node1 = node1.next;
            node2 = node2.next;
        }

        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }

        if (carry == 1) {
            p.next = new ListNode(1);
        }

        return head.next;
    }
}
