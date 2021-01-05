package algorithm.test;

/**
 * 链表
 */
public class Test20201204 {
    static Node successor = null;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node node = reverseList1(head);

        System.out.println(node.data);
        System.out.println(node.next.data);
        System.out.println(node.next.next.data);
        System.out.println(node.next.next.next.data);
        System.out.println(node.next.next.next.next.data);
        System.out.println(node.next.next.next.next.next.data);
        System.out.println(node.next.next.next.next.next.next.data);
    }

    /**
     * 奇偶链表
     * @param head
     * @return
     */
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node tmp = head;
        Node node = head.next;
        Node nextNode = head.next;
        while (node != null && node.next != null) {
            head.next = head.next.next;
            head = head.next;
            node.next = node.next.next;
            node = node.next;
        }
        head.next = nextNode;
        return tmp;
    }

    /**
     * 翻转链表
     * @param head
     * @return
     */
    public static Node reverseList1(Node head) {
        Node pre = null;
        while (head != null) {
            Node tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
    public static Node reverseList2(Node head) {
        if (head.next == null)
            return head;

        Node last = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 翻转前n个节点
    public static Node reverseList3(Node head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        Node last = reverseList3(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    // 翻转链表一部分
    public static Node reverseList4(Node head, int m, int n) {
        if (m == 1) {
            return reverseList3(head, n);
        }
        head.next = reverseList4(head.next, m - 1, n - 1);
        return head;
    }
}
