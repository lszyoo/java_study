package datastruct;

/**
 * 单向链表
 */
public class LinkList {
    // 第一个节点
    private Node first;
    // 链表中节点数量
    private int nElem;

    public LinkList(){
        first = null;
        nElem = 0;
    }

    /**
     * 添加头结点
     */
    public void insertFirst(int value) {
        Node firstNode = new Node(value);
        firstNode.next = first;
        first = firstNode;
        nElem ++;
    }

    /**
     * 删除头结点
     */
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("链表为空");
            return null;
        }
        Node temp = first;
        first = first.next;
        nElem--;
        return temp;
    }

    /**
     * 链表是否为空
     */
    public boolean isEmpty() {
        return first == null;
    }


    /**
     * 链表的结点
     */
    class Node {
        // 数据域
        private long data;
        // 指针域
        private Node next;

        public Node(long value) {
            this.data = value;
        }

        /**
         * 显示方法
         */
        public void display() {
            System.out.print(data + " ");
        }
    }
}
