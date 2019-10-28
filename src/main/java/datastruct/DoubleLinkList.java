package datastruct;

/**
 * 双向链表
 */
public class DoubleLinkList {
    // 头结点
    private Node first;
    // 尾结点
    private Node last;
    // 链表长度
    private int size;

    public DoubleLinkList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    class Node {
        // 数据
        private long data;
        private Node next;
        private Node pre;

        public Node(long value) {
            this.data = value;
            this.next = null;
            this.pre = null;
        }
    }
}
