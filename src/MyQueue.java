public class MyQueue<T extends Comparable<T>> {
    private final MyList<T> list;
    public MyQueue() {
        this.list = new MyLinkedList<>();
    }
    public boolean empty() {
        return list.size() == 0;
    }
    void enqueue(T item) {
        list.add(item);
    }
    public T dequeue() {
        if (empty()) {
            return null;
        }
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }
    public T peek() {
        if (empty()) {
            return null;
        }
        return list.getFirst();
    }
    public int size() {
        return list.size();
    }
}
