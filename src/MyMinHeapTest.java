public class MyMinHeapTest {
    public static void main(String[] args) {
        System.out.println("--- MyMinHeap<Integer> Test ---");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        // Insert elements into the heap
        heap.insert(5);
        heap.insert(2);
        heap.insert(8);
        heap.insert(1);
        heap.insert(9);
        heap.insert(3);
        System.out.println("Min element: " + heap.getMin()); // Expected: 1
        // Extract the minimum element
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 1
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 2
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 3
        // Check if the heap is empty
        System.out.println("Is heap empty? " + heap.empty()); // Expected: false
        // Extract remaining elements
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 5
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 8
        System.out.println("Extract Min: " + heap.extractMin()); // Expected: 9
        System.out.println("Is heap empty? " + heap.empty()); // Expected: true
        // Test size()
        heap.insert(15);
        heap.insert(25);
        System.out.println("Heap size: " + heap.size()); // Expected: 2
    }
}