public class MyStack<T extends Comparable<T>> {
    private final MyList<T> list;
    public MyStack() {
        this.list = new MyLinkedList<>();
    }
    public boolean empty() {
        return list.size() == 0;
    }
    public void push(T item) {
        list.addLast(item);
    }
    public T pop() {
        if (empty()) return null;
        T item = list.getLast();
        list.removeLast();
        return item;
    }
    public T peek() {
        if (empty()) return null;
        return list.getLast();
    }
}
