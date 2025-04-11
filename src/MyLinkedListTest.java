public class MyLinkedListTest {
    public static void main(String[] args) {

        System.out.println("--- Testing MyLinkedList<Integer> ---");
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(5);
        intList.add(1);
        intList.add(4);
        intList.add(2);
        intList.add(8);

        System.out.println("Original list:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        intList.sort();
        System.out.println("Sorted list (Comparable):");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Size: " + intList.size());
        System.out.println("Get at index 2: " + intList.get(2));
        System.out.println("First element: " + intList.getFirst());
        System.out.println("Last element: " + intList.getLast());
        System.out.println("Index of 4: " + intList.indexOf(4));
        System.out.println("Last index of 1: " + intList.lastIndexOf(1));
        System.out.println("Exists 2: " + intList.exists(2));
        System.out.println("Exists 10: " + intList.exists(10));

        intList.add(0, 0);
        System.out.println("List after adding at index 0:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        intList.set(1, -1);
        System.out.println("List after setting at index 1:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        intList.remove(2);
        System.out.println("List after removing at index 2:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        intList.removeFirst();
        System.out.println("List after removeFirst:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        intList.removeLast();
        System.out.println("List after removeLast:");
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Object[] intArray = intList.toArray();
        System.out.println("Array from list:");
        for (Object o : intArray) {
            System.out.print(o + " ");
        }
        System.out.println();

        intList.clear();
        System.out.println("List after clear (size): " + intList.size());

        System.out.println("\n--- Testing MyLinkedList<String> with Comparator ---");
        MyLinkedList<String> strList = new MyLinkedList<>();
        strList.add("banan");
        strList.add("alma");
        strList.add("qarbyz");

        System.out.println("Original string list:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();

        strList.sort();
        System.out.println("Sorted string list (natural order):");
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();
    }
}