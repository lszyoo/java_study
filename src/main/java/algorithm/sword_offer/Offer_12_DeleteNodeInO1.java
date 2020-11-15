package algorithm.sword_offer;

/**
 * 在 O(1)的时间删除链表结点:
 *      若顺序遍历链表的话，时间复杂度为 O(n)；而删除结点，可以找到结点的下个结点，完成指针转移后再将下个结点删除。
 *      注意最后一个结点，以及头结点等。
 *      时间复杂度为 [(n-1)O(1)+O(n)]/n, 即 O(1);
 */
public class Offer_12_DeleteNodeInO1 {
    public static void main(String[] args) {
        Node head = null;
        print(DeleteNode(head, head));
        head = new Node(0);
        Node p = head;
        // (3)只有一个结点，删除尾结点(也是头结点)
        print(DeleteNode(head, head));
        for(int i = 1; i < 5; i++){
            Node node = new Node(i);
            p.next = node;
            p = p.next;
        }
        Node tail = new Node(5);
        p.next = tail;
        print(head);
        print(DeleteNode(head, head));
        // (2)多个结点，删除尾结点
        print(DeleteNode(head, tail));
        // (1)删除的不是尾结点
        print(DeleteNode(head, head.next));
    }

    /**
     * 思路：把下一个结点的内容赋值给需要删除的结点
     * @param headNode
     * @param deleteNode
     * @return
     */
    public static Node DeleteNode(Node headNode, Node deleteNode) {
        // 1、如果链表为空，或者要删除的节点为空，返回 null
        if (headNode == null || deleteNode == null) {
            return null;
        }
        // 删除的不是尾结点
        if (deleteNode.next != null) {
            // 找到要删除的结点的下一个结点，将其值赋值给要删除的结点
            // 并将下一个结点删除，即为删除了该节点，时间复杂度才为 O(1)
            Node nextNode = deleteNode.next;
            deleteNode = nextNode;    // 将 next 向前移动一个
            nextNode = null;
        } else if (headNode == deleteNode) {     // 只有一个结点，删除尾结点(也是头结点)
            headNode = null;
        } else {    // 多个结点，删除尾结点
            Node node = headNode;
            while (node.next != deleteNode) {
                node = node.next;
            }
            node.next = null;
        }
        return headNode;
    }

    public static void print(Node head){
        if(head == null) {
            System.out.println("list is null");
        }
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    //同一个包下不要定义重名的 node，不然会报错
    static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }
}
