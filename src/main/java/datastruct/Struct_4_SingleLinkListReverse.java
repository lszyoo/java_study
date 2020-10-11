package datastruct;

/**
 * 单链表反转
 */
public class Struct_4_SingleLinkListReverse {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        Node reverse1 = recursiveReverse(node);
        System.out.println(reverse1.value); // 4
        System.out.println(reverse1.next.value); // 3
        System.out.println(reverse1.next.next.value); // 2
        System.out.println(reverse1.next.next.next.value); // 1

        Node reverse2 = traverseReverse(reverse1);
        System.out.println(reverse2.value); // 1
        System.out.println(reverse2.next.value); // 2
        System.out.println(reverse2.next.next.value); // 3
        System.out.println(reverse2.next.next.next.value); // 4
    }

    /**
     * 递归
     */
    public static Node recursiveReverse(Node node) {
        if (node == null || node.next == null)
            return node;
        Node tmp = node.next;
        Node reverseNode = recursiveReverse(node.next);
        node.next.next = node;
        node.next = null;
        return reverseNode;
    }

    /**
     * 遍历
     */
    public static Node traverseReverse(Node node) {
        Node reverseNode = null;
        Node tmp = null;
        while (node != null) {
            tmp = node.next;
            node.next = reverseNode;
            reverseNode = node;
            node = tmp;
        }
        return reverseNode;
    }

    static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
