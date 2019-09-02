package sword_offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列，并分别完成在队列尾部插入结点和队列头部删除结点的功能。
 *
 * 实现队列删除元素：首先需要分析stack2中不为空时，在stack2中的栈顶元素是最先进入队列的元素，可以弹出。
 * 如果stack2为空时，我们把stack1中的元素逐个弹出并压入stack2。由于先进入队列的元素被压到stack1的底端，
 * 经过弹出和压入之后就处于stack2的顶端了，又可以直接弹出。
 */
public class Offer_5_QueueWithTwoStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.stack1.push(1);
        queue.stack1.push(2);
        System.out.println(queue.pop());
        // 输出：1
    }

    private static class MyQueue<Object> {
        public static Stack<Integer> stack1 = new Stack<>();
        public static Stack<Integer> stack2 = new Stack<>();
        // 进栈操作
        public static void push(int node) {
            stack1.push(node);
        }

        // 出栈操作
        public static int pop() {
            while (!stack2.isEmpty()) {
                return stack2.pop();
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
