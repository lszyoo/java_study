package datastruct;

/**
 * 用数组表现栈：先进后出
 */
public class StackWithArray {
    private long[] arr;
    private int top;

    /**
     * 默认的构造方法
     */
    public StackWithArray() {
        arr = new long[10];
        top = -1;
    }

    /**
     * 带参数构造方法，参数为数组初始化大小
     */
    public StackWithArray(int maxsize) {
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value) {
        arr[++top] = value;
    }

    /**
     * 移除数据
     */
    public long pop() {
        return arr[top--];
    }

    /**
     * 查看数据
     */
    public long peek() {
        return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return top == arr.length - 1;
    }
}
