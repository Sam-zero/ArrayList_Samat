public class MyStackTest {
    public static void main(String[] args) {
        System.out.println("--- MyStack<Integer> Test ---");
        MyStack<Integer> stack = new MyStack<>();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // Peek at the top element
        System.out.println("Peek: Top element = " + stack.peek());  // Expected: 30
        // Pop elements from the stack
        System.out.println("Pop: Top element = " + stack.pop());    // Expected: 30
        System.out.println("Pop: Top element = " + stack.pop());    // Expected: 20
        System.out.println("Is stack empty? " + stack.empty());   // Expected: false
        System.out.println("Pop: Top element = " + stack.pop());    // Expected: 10
        System.out.println("Is stack empty? " + stack.empty());   // Expected: true
        System.out.println("Peek from empty stack: " + stack.peek()); // Expected: null
    }
}