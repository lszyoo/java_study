package datastruct;

public class Main {
    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray();
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        System.out.println(queue.remove());
    }
}
