public class MyQueueTest {
    public static void main(String[] args) {
        System.out.println("--- MyQueue<String> Test ---");
        MyQueue<String> queue = new MyQueue<>();
        // Enqueue elements into the queue
        queue.enqueue("Almas");
        queue.enqueue("Kanat");
        queue.enqueue("Oljas");
        System.out.println("Peek: Front element = " + queue.peek()); // Expected: Almas
        // Dequeue elements from the queue
        System.out.println("Dequeue: Front element = " + queue.dequeue()); // Expected: Almas
        System.out.println("Dequeue: Front element = " + queue.dequeue()); // Expected: Kanat
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.empty()); // Expected: false
        System.out.println("Dequeue: Front element = " + queue.dequeue()); // Expected: Oljas
        System.out.println("Is queue empty? " + queue.empty()); // Expected: true
        System.out.println("Dequeue from empty queue: " + queue.dequeue()); // Expected: null
        System.out.println("Peek from empty queue: " + queue.peek()); // Expected: null
        // Test size()
        queue.enqueue("Zhanat");
        queue.enqueue("Marat");
        System.out.println("Queue size: " + queue.size()); // Expected: 2
    }
}