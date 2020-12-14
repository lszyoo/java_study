package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断链表是否有环
 */
public class Al_7_DetectCycleList {
    public static void main(String[] args) {

    }

    /**
     * 集合法
     * @param head
     * @return
     */
    public static Node detectCycleList1(Node head) {
        Set<Node> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public static Node detectCycleList2(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
