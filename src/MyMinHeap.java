public class MyMinHeap<T extends Comparable<T>> {
    private final MyList<T> list;

    public MyMinHeap() {
        this.list = new MyArrayList<>();
    }

    public boolean empty() {
        return list.size() == 0;
    }
    public int size() {
        return list.size();
    }

    public void insert(T element) {
        list.add(element);
        traverseUp(list.size() - 1);
    }

    public T extractMin() {
        T min = getMin();
        T last = list.get(list.size() - 1);
        list.set(0, last);
        list.removeLast();
        if (!empty()) {
            heapify(0);
        }
        return min;
    }

    public T getMin() {
        if (empty()) return null;
        return list.getFirst();
    }

    private void heapify(int index) {
        int left = leftChildOf(index);
        int right = rightChildOf(index);
        int smallest = index;

        if (left < list.size() && list.get(left).compareTo(list.get(smallest)) < 0) {
            smallest = left;
        }

        if (right < list.size() && list.get(right).compareTo(list.get(smallest)) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void traverseUp(int index) {
        while (index > 0 && list.get(index).compareTo(list.get(parentOf(index))) < 0) {
            swap(index, parentOf(index));
            index = parentOf(index);
        }
    }

    private int leftChildOf(int index) {
        return 2 * index + 1;
    }

    private int rightChildOf(int index) {
        return 2 * index + 2;
    }

    private int parentOf(int index) {
        return (index - 1) / 2;
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}