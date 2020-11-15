package algorithm.sword_offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 由两个队列实现一个栈的操作
 *
 * 模拟栈的入栈操作：如果两个队列都为空，优先选择队列1添加元素，否则，哪个队列有元素，就在哪个队列尾部追加元素。
 *
 * 模拟栈的出栈操作：如果两个队列都为空，抛出异常；否则，模拟栈的出栈规则，后进先出，即将其中一个不为空的队列的
 *      前 n-1 个元素从当前队列删除，添加入另一个队列中，再把此队列剩余的最后一个元素删除。故模拟栈的出栈操作。
 */
public class Offer_6_StackWithTwoQueue {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        // 输出：2
    }

    public static class MyStack<E> {
        // Queue 是接口，故不能直接实例化
        private Queue<E> queue1 = new LinkedList<>();
        private Queue<E> queue2 = new LinkedList<>();

        // 入栈
        public void push(E e) {
            if (queue1.isEmpty() && queue2.isEmpty()) {
                queue1.add(e);
                return;
            }
            // 如果队列1为空，向队列2添加元素
            if (queue1.isEmpty()) {
                queue2.add(e);
                return;
            }
            // 如果队列2为空，向队列1添加元素
            if (queue2.isEmpty()) {
                queue1.add(e);
                return;
            }
        }

        // 出栈
        public E pop() {
            if (queue1.isEmpty() && queue2.isEmpty()) {
                try {
                    throw new Exception("栈为空！");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            // 如果queue1 为空，将 queue2 的前 queue2.size()-1 个元素弹出放入 queue1 队列，queue2 的最后一个元素直接弹出
            if (queue1.isEmpty()) {
                while (queue2.size() > 1)
                    queue1.add(queue2.poll());
                return queue2.poll();
            }


            // 如果 queue2 为空，将 queue1 的前 queue1.size()-1 个元素弹出放入 queue2 队列，queue1 的最后一个元素直接弹出
            if (queue2.isEmpty()) {
                while (queue1.size() > 1)
                    queue2.add(queue1.poll());
                return queue1.poll();
            }

            return null;
        }
    }
}
