package algorithm;

/**
 * 题目：奇偶链表
 *
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 *
 * 示例 2:
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 *
 * 说明:
 *
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 *
 * 解题思路：
 *
 * 首先我们将第一个奇数节点（也就是头节点）的地址存起来，然后将所有奇数节点按照原有次序链接起来。
 * 其次把第一个偶数节点（第二个节点）的地址存起来，然后将所有的偶数节点按照原有次序链接起来。
 * 最后将偶数的第一个节点（此时应是被保存起来的偶数节点），链接在奇数的最后一个节点后面。然后返回被保存的头节点。
 */
public class Al_4_OddEvenList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node node = oddEvenList(head);

        System.out.println(node.data);
        System.out.println(node.next.data);
        System.out.println(node.next.next.data);
        System.out.println(node.next.next.next.data);
        System.out.println(node.next.next.next.next.data);
        System.out.println(node.next.next.next.next.next.data);
        System.out.println(node.next.next.next.next.next.next.data);
    }

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 保存头节点，间接引用
        Node dumpNode = head;
        // 保存第一个偶数节点
        Node node = head.next;
        Node nextNode = node;
        while (node != null && node.next != null) {
            // 依次将奇数节点链接起来
            head.next = head.next.next;
            head = head.next;
            // 依次将偶数节点链接起来
            node.next = node.next.next;
            node = node.next;
        }
        // 将第一个偶数节点链接到最后一个奇数节点的后面
        head.next = nextNode;

        return dumpNode;
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
